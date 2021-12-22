package neobank.loanbanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

	@GetMapping("/")
	public String greeting() {
		return "Welcome to NEO Loan Banking.";
	}

	@GetMapping("/loanByID/{id}")
	public Loan getLoanById() {
		Loan loan = new Loan();
		loan.setLoanId("l101");
		loan.setAmt(100000);
		loan.setTenuer(60);
		return loan;
	}

	
}