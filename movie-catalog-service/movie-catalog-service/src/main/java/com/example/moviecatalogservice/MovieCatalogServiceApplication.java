package com.example.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class MovieCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){

		return new RestTemplate();
	}

	public static void main(String[] args) {

//		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//		public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

//		System.out.println(Pattern.matches("(\\w\\d)\\1", "a2b2")); //false
//		System.out.println(Pattern.matches("(\\w\\d)\\1", "a2a2")); //true
//		System.out.println(Pattern.matches("(AB)(B\\d)\\1\\2", "ABB3ABB3")); //false
//		System.out.println(Pattern.matches("(AB)(B\\d)\\1\\2", "ABB2ABB2")); //true

		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
