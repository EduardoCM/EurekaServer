package com.codigorupestre.spacenative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class CodigoRupestreEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodigoRupestreEurekaServerApplication.class, args);
	}

}
