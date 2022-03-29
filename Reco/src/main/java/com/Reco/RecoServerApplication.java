package com.Reco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RecoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecoServerApplication.class, args);
	}

}
