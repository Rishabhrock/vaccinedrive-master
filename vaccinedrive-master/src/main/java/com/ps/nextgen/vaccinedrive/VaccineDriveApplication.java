package com.ps.nextgen.vaccinedrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VaccineDriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineDriveApplication.class, args);
	}

} 
