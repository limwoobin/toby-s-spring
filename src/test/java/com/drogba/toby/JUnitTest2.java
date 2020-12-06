package com.drogba.toby;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

// JUnit 이 매번 새로운 테스트 오브젝트를 만든다는 사실을 확인할 수 있다.
public class JUnitTest2 {
    static Set<JUnitTest2> testObjects = new HashSet<>();

    @Test
    public void test1() {
        assertThat(testObjects , not(hasItem(this)));
        testObjects.add(this);
    }

    @Test
    public void test2() {
        assertThat(testObjects , not(hasItem(this)));
        testObjects.add(this);
    }

    @Test
    public void test3() {
        assertThat(testObjects , not(hasItem(this)));
        testObjects.add(this);
    }
}
