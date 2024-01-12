package com.example.springbootdockercomposeapp.repository;

import com.example.springbootdockercomposeapp.model.FruitModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface FruitRepository extends MongoRepository<FruitModel,String> {
}