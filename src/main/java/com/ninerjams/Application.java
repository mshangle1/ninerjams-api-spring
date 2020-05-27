package com.ninerjams;

import com.ninerjams.model.User;
import com.ninerjams.repository.UserRepository;
import com.ninerjams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Qualifier("userRepository")
	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(new User("1","Matt","Shangle","matt@sample.com","mshangle","hehexD"));
		repository.save(new User("2","Connor","Gallimore","cgall@sample.com","cgall","hehexD2"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Matt'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Matt"));

		System.out.println("Customers found with findByLastName('Gallimore'):");
		System.out.println("--------------------------------");
		for (User user : repository.findByLastName("Gallimore")) {
			System.out.println(user);
		}

	}
}
