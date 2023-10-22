package com.dio.diospringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringProjectApplication.class, args);
	}

}
