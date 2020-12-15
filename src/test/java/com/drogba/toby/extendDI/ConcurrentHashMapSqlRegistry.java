package com.drogba.toby.extendDI;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ConcurrentHashMapSqlRegistry implements UpdatableSqlRegistry {
    private Map<String , String> sqlMap = new ConcurrentHashMap<>();

    @Override
    public String findSql(String key) {
        return null;
    }

    @Override
    public void updateSql(String key, String sql) {

    }

    @Override
    public void updateSql(Map<String, String> sqlMap) {

    }

    @Override
    public void register(String key, String sql) {

    }
}
