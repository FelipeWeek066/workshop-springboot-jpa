package com.Study.Course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Study.Course.entities.Category;
import com.Study.Course.entities.Order;
import com.Study.Course.entities.Product;
import com.Study.Course.entities.User;
import com.Study.Course.enums.OrderStatus;
import com.Study.Course.repositories.CategoryRepository;
import com.Study.Course.repositories.OrderRepository;
import com.Study.Course.repositories.ProductRepository;
import com.Study.Course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
    private UserRepository UserRepository;
	@Autowired
	private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired 
    private ProductRepository productRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 

		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		User u1 = new User(null, "Felipe", "felipe@gmail.com", "631241440", "password123");
		User u2 = new User(null, "Ana", "Ana@gmail.com", "12345678", "password111");

		UserRepository.saveAll(Arrays.asList(u1,u2));
		Order o1 = new Order(null, OrderStatus.Paid, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, OrderStatus.Waiting_Payment, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, OrderStatus.Waiting_Payment,Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		
		
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
