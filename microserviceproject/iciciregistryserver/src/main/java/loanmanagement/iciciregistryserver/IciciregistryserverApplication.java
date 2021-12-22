package loanmanagement.iciciregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class IciciregistryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(IciciregistryserverApplication.class, args);
	}

}
