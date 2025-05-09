package com.acorn.web.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.acorn.web.dto.User;

@Repository
public class UserRepository {

    private static Map<String, User> users = new HashMap<>();

    static {
        users.put("admin", new User("admin", "1234", "관리자"));
        users.put("user1", new User("user1", "abcd", "홍길동"));
    }

    public User findById(String id) {
        return users.get(id);
    }
    
    public void save(User user) {
        users.put(user.getId(), user);
    }

}
