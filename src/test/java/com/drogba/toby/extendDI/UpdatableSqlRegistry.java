package com.drogba.toby.extendDI;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface UpdatableSqlRegistry extends SqlRegistry {
    public void updateSql(String key , String sql);

    public void updateSql(Map<String , String> sqlMap);
}
