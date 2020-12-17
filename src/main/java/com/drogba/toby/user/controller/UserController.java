package com.drogba.toby.user.controller;

import com.drogba.toby.user.Hello;
import com.drogba.toby.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final Hello hello;

    @GetMapping("")
    public String userTest() {
        System.out.println(hello.getText());

        return userService.userTests();
    }
}
