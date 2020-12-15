package com.drogba.toby.extendDI;

public interface SqlRegistry {
    void register(String key , String sql);

    String findSql(String key);
}
