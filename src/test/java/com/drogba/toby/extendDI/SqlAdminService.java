package com.drogba.toby.extendDI;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SqlAdminService {
    private final UpdatableSqlRegistry sqlRegistry;
}
