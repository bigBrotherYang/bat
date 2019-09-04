package com.xtkj.dao;

import com.xtkj.pojo.Permissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}