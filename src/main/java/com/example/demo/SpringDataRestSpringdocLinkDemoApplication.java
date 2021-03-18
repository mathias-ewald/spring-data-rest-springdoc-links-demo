package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class SpringDataRestSpringdocLinkDemoApplication implements ApplicationListener<ContextRefreshedEvent> {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestSpringdocLinkDemoApplication.class, args);
	}
	
	@Autowired
	private GreetingRepo repo;
	
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    	repo.save(new Greeting("Hello world"));
    }

}
