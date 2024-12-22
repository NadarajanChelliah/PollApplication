package com.project.pollapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EntityScan(basePackages = "com.project.pollapplication.model")
public class PollapplicationApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(PollapplicationApplication.class, args);
	}
}
