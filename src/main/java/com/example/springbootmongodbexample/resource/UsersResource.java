package com.example.springbootmongodbexample.resource;

import com.example.springbootmongodbexample.document.Users;
import com.example.springbootmongodbexample.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    private UsersRepository userRepository;

    public UsersResource(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
