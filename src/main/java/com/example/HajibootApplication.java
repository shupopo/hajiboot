package com.example;

import com.example.app.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class HajibootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootApplication.class, args);
		Frontend frontend = context.getBean(Frontend.class);
		frontend.run();
	}
}
