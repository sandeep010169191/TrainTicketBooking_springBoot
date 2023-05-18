package com.sandeep.TrainBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class TrainBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainBookingApplication.class, args);
	}

}
