package com.drogba.toby.test.service;

import com.drogba.toby.test.dao.TestDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestDao testDao;

    public String testService() {
        return testDao.testDao();
    }
}
