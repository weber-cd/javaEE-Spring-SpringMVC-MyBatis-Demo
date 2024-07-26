package com.boot.service;

import com.boot.po.BaseDict;

import java.util.List;

public interface BaseDictService {
    // 根据类别代码查询数据字段
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
