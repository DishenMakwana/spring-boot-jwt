package com.jwt.dishen.JwtSetup.services;

import com.jwt.dishen.JwtSetup.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Dishen", "dishen@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Makwana", "makwana@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Raj", "raj@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }
}