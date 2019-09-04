package com.xtkj.dao;

import com.xtkj.pojo.User;

import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String getpwd(String userName);


    Set<String> getRoleByUsername(String usernam);

    Set<String> getPremissionsByUsername(String usernam);
}