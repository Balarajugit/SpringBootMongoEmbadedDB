package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ConsoleRunner;
@Component
public class DataRunner implements CommandLineRunner {
	@Autowired
	private ConsoleRunner repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Product(434, "Trimmer", 1500.00));
		repo.save(new Product(34, "HeadSet", 500.00));
		repo.save(new Product(439, "laptop", 45000.00));
		repo.save(new Product(84, "mimobile", 10000.00));
		System.out.println("-----------------------------------");
		
		List<Product> l=repo.findAll();
		l.forEach(System.out::println);
		System.out.println("----------------------------------");
	
		repo.findByPid(434).forEach(System.out::println);
	}

}
