package abcretailonline.abcregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AbcregistryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcregistryserverApplication.class, args);
	}

}
