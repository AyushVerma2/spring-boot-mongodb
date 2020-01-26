package com.example.mongodb.springbootmongodb.repo;


import com.example.mongodb.springbootmongodb.doc.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
