package com.lpras.jmsamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.abc", "com.lpras.jmsamq", "com.lpras.email.config", "com.lpras.email.service"})
public class ActivemqReceiverApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqReceiverApplication.class, args);
	}

}
