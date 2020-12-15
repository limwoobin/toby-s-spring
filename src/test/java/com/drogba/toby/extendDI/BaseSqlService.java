package com.drogba.toby.extendDI;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BaseSqlService {
    private final ConcurrentHashMapSqlRegistry sqlRegistry;
}
