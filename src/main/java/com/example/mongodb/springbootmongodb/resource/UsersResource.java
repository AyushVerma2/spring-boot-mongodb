package com.example.mongodb.springbootmongodb.resource;

import com.example.mongodb.springbootmongodb.doc.Users;
import com.example.mongodb.springbootmongodb.repo.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Users> get(@PathVariable  Integer id) {
        return userRepository.findById(id);
    }
}
