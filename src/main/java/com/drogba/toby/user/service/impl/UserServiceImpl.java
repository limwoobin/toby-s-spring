package com.drogba.toby.user.service.impl;

import com.drogba.toby.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String userTests() {
        String result = "";
        for (int i=0; i<100; i++) {
            result += String.valueOf(i);
        }

        return result;
    }
}
