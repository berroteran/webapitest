package com.examen.webapitest.services;

import com.examen.webapitest.entities.User;
import com.examen.webapitest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService {
    private static final Logger LOGGER = Logger.getLogger( UserService.class.getName() );

    @Autowired
    private UserRepository repository;

    public List<User> findAll () {
        return repository.findAll();
    }

    public Optional<Object> findById (long id) {
        return Optional.of( repository.findById( id ) );
    }

    public User save (User user) {

        return null;
    }
}
