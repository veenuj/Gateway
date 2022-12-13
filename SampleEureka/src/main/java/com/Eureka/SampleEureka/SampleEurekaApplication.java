package com.Eureka.SampleEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SampleEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleEurekaApplication.class, args);
	}

}
