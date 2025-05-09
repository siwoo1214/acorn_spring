package com.acorn.web.dao;

import java.util.HashMap;
import java.util.Map;

import com.acorn.web.dto.User;

public class UserDAO {
    private static Map<String, User> users = new HashMap<>();

    static {
        // 임시로 회원 추가한거
        users.put("user1", new User("user1", "1234", "박시우"));
        users.put("user2", new User("user2", "5678", "홍길동"));
    }

    public User login(String id, String password) {
        User user = users.get(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
