package com.app.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.Product;

public interface ConsoleRunner extends MongoRepository<Product, String> {
	public List<Product> findByPid(Integer pid);
}
