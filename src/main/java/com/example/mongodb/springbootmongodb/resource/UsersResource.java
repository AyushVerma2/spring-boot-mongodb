package com.example.mongodb.springbootmongodb.resource;

import com.example.mongodb.springbootmongodb.doc.Users;
import com.example.mongodb.springbootmongodb.repo.UserRepository;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/addUser")
    public void addUser(@RequestBody Users users) {
        //code
        userRepository.save(users);
    }
    @PutMapping(path = "/updateUser")
    public void updateUser(@RequestBody Users users) {
        //code
        userRepository.save(users);
    }
    @DeleteMapping(path = "/deleteUser")
    public void deleteUser(@RequestBody Users users) {
        //code
        userRepository.delete(users);
    }
}
