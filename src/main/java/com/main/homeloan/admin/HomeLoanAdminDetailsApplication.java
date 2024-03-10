package com.main.homeloan.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanAdminDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanAdminDetailsApplication.class, args);
	}

}
