package com.example.mongodb.springbootmongodb.config;


import com.example.mongodb.springbootmongodb.doc.Users;
import com.example.mongodb.springbootmongodb.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Ayush", "Development", 33L));
            userRepository.save(new Users(2, "Verma", "Manager", 20L));
        };
    }

}
