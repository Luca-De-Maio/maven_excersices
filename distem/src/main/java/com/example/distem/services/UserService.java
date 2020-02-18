package com.example.distem.services;

import com.example.distem.models.User;
import com.example.distem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(Long idUser){
        return userRepository.findById(idUser).orElse(null);
    }

    public User getByName(String name) {
        return userRepository.findByName(name).orElse(null);
    }
}
