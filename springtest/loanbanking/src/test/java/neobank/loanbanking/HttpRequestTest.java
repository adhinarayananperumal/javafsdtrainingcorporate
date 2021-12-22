package neobank.loanbanking;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.fasterxml.jackson.databind.ObjectMapper;

import neobank.loanbanking.controller.Loan;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private JacksonTester<Loan> loan;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
				.contains("Welcome to NEO Loan Banking.");
	}

	@Test
	public void getLoanById() throws Exception {

		ObjectMapper Obj = new ObjectMapper();

		Loan loanexp = new Loan();
		loanexp.setLoanId("l101");
		loanexp.setAmt(100000);
		loanexp.setTenuer(60);
		
		String jsonStrexp = Obj.writeValueAsString(loanexp);

		Loan loan = this.restTemplate.getForObject("http://localhost:" + port + "/loanByID/101", Loan.class);

		String loanactual = Obj.writeValueAsString(loan);

		JSONAssert.assertEquals(jsonStrexp, loanactual, JSONCompareMode.LENIENT);

	}

}