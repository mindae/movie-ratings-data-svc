package com.mindae.movieratingsdatasvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MovieRatingsDataSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingsDataSvcApplication.class, args);
	}

}
