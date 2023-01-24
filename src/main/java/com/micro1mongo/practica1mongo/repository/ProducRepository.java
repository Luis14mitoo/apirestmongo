package com.micro1mongo.practica1mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;



import com.micro1mongo.practica1mongo.entity.ProductEntity;

public interface ProducRepository extends MongoRepository<ProductEntity, String> {
	 


}
