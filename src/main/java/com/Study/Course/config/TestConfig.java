package com.Study.Course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Study.Course.entities.User;
import com.Study.Course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
    private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(0L, "Felipe", "felipe@gmail.com", "631241440", "password123");
		User u2 = new User(0L, "Ana", "Ana@gmail.com", "12345678", "password111");

		repository.saveAll(Arrays.asList(u1,u2));

	}
	
	
}
