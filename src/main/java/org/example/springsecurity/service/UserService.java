package org.example.springsecurity.service;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.model.User;
import org.example.springsecurity.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    public void save(User user) {
        this.userRepository.save(user);
    }

    public Long count() {
        return this.userRepository.count();
    }
}
