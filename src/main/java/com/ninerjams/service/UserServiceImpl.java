package com.ninerjams.service;

import com.ninerjams.model.User;
import com.ninerjams.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(){}

    @Autowired
    public UserServiceImpl(@Qualifier("userRepository") UserRepository userRepository){
        repository = userRepository;
    }

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }
}
