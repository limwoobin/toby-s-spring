package com.drogba.toby.user.service.impl;

import com.drogba.toby.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
public class UserPerformance implements UserService {

    private final UserService userService;

    @Override
    public String userTests() {
        long start = before();
        String tests = userService.userTests();
        after(start);
        return tests;
    }

    private long before() {
        return System.nanoTime();
    }

    private void after(long start) {
        long end = System.nanoTime();
        System.out.println("runtime: " + (end - start));
    }
}
