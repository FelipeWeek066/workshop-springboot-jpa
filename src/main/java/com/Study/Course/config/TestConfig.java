package com.Study.Course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Study.Course.entities.Order;
import com.Study.Course.entities.User;
import com.Study.Course.enums.OrderStatus;
import com.Study.Course.repositories.OrderRepository;
import com.Study.Course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
    private UserRepository UserRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Felipe", "felipe@gmail.com", "631241440", "password123");
		User u2 = new User(null, "Ana", "Ana@gmail.com", "12345678", "password111");

		UserRepository.saveAll(Arrays.asList(u1,u2));
		Order o1 = new Order(null, OrderStatus.Paid, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, OrderStatus.Waiting_Payment, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, OrderStatus.Waiting_Payment,Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
