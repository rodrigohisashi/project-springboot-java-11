package com.rht.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rht.course.entities.User;
import com.rht.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	// Associar uma dependência fraca (desacoplada por meio da framework SpringBoot)
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Rodrigo Hisashi", "rodrigohisa@gmail.com", "123456789", "1234567");
		User u2 = new User(null, "Fernando Trinity", "fertrinity@gmail.com", "12326789", "1233567");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
