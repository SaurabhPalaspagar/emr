package com.hospital.emr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.hospital.emr"})
public class EmrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmrApplication.class, args);
	}
}
