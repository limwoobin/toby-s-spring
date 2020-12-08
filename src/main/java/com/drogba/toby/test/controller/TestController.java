package com.drogba.toby.test.controller;

import com.drogba.toby.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping("")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>(testService.testService() , HttpStatus.OK);
    }
}
