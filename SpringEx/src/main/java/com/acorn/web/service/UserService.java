package com.acorn.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.web.dao.UserDAO;
import com.acorn.web.dto.User;
import com.acorn.web.repository.UserRepository;

@Component
public class UserService {
	@Autowired
    private UserRepository repo;

    public User login(String id, String password) {
        User user = repo.findById(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    
    public boolean join(User user) {
        if (repo.findById(user.getId()) != null) {
            return false;
        }
        repo.save(user);
        return true;
    }
}
