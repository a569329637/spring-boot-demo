package com.gsq.springbootdemo.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/demo")
public class DemoApplication {

	@Value("${demo.username}")
	private String userName;
	@Value("${demo.password}")
	private String password;

	@RequestMapping("/1")
	String index() {
		return "Hello Spring Boot";
	}

	@RequestMapping("/2")
	String index1() {
		return "username = " + userName + " <br/>password = " + password;
	}

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

//		SpringApplication app = new SpringApplication(DemoApplication.class);
//		app.setShowBanner(false);
//		app.run(args);

		new SpringApplicationBuilder(DemoApplication.class).showBanner(false).run(args);
	}
}
