package com.examen.webapitest.weapi;

import com.examen.webapitest.entities.User;
import com.examen.webapitest.repositories.UserRepository;
import com.examen.webapitest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/user")
public class UserController {

    @Autowired
    UserService service;


    @GetMapping
    public List<User> findAllUsers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable (value = "id") long id) {
        return (User) service.findById(  id ).orElseGet( null );
    }

    @PostMapping
    public User saveUser(@Validated @RequestBody User user) {
        return service.save(user);
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping ("/users")
    List<User> all() {
        return service.findAll();
    }
    // end::get-aggregate-root[]

}
