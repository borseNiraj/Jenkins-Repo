package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.engine,com.example")
public class SbComponentScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbComponentScanApplication.class, args);
	}

}
