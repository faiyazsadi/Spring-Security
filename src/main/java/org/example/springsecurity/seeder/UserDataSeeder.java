package org.example.springsecurity.seeder;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.model.User;
import org.example.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserDataSeeder implements CommandLineRunner {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if(this.userService.count() != 0) {
            return;
        }
        User user = new User();
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        user.setRole("admin");
        this.userService.save(user);
    }
}
