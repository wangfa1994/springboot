package com.wf.springboot06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.wf")
@PropertySource({"setting.properties"})
public class Springboot06Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot06Application.class, args);
	}


	@RequestMapping("/")
	public String index(){
		return "hello spring boot";
	}
}
