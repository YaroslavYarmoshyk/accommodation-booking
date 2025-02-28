package com.accommodationbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class AccommodationBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccommodationBookingApplication.class, args);
    }

}
