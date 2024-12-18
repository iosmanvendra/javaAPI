package com.example.demo;
import com.example.demo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FollowerController {

    @GetMapping("/followers")
    public List<String> getFollowers() {
        return List.of("Alice", "Bob", "Charlie", "David", "Eve");
    }
    @GetMapping("/users")
    public List<User> getusers() {
        List<User> users = List.of(
            new User("Alice", "alice@example.com", "123 Main St", "123-456-7890"),
            new User("Bob", "bob@example.com", "456 Oak St", "234-567-8901"),
            new User("Charlie", "charlie@example.com", "789 Pine St", "345-678-9012"),
            new User("David", "david@example.com", "101 Maple St", "456-789-0123"),
            new User("Eve", "eve@example.com", "202 Birch St", "567-890-1234")
        );
        return users;
    }
}
