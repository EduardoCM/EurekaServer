package com.codigorupestre.spacenative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class CodigoRupestreUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodigoRupestreUsuariosApplication.class, args);
	}

}
