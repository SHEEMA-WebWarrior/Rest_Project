package com.example.model.Service;

import com.example.model.Repository.UserRepository;
import com.example.model.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Page<User> searchUsersByName(String name, Pageable pageable) {
        return userRepository.searchUsersByName(name, pageable);
    }
}
