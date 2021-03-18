package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepo extends CrudRepository<Greeting, Long> {

}
