package com.micro1mongo.practica1mongo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.micro1mongo.practica1mongo.entity.ProductEntity;
import com.micro1mongo.practica1mongo.repository.ProducRepository;



@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProducRepository productRepository;
	

	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity>  getAllProducts(){	
		return productRepository.findAll();
		
	}
	
	/*
	
	@GetMapping
	public ResponseEntity<List<ProductEntity>> getAllProduct(){
		List<ProductEntity> ProductEntities = productRepository.findAll();
		ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<> (ProductEntities , HttpStatus.OK);
		return responseEntity;		
		
	}
	
	*/
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createProduc(@RequestBody ProductEntity productEntity) {
		productRepository.save(productEntity);
				
	}
	
	
	
}
