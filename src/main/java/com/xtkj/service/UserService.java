package com.xtkj.service;

import com.xtkj.utils.JsonResult;

import java.util.Set;

public interface UserService {
    String getUsernameByPwd(String username);

    Set<String> getRoleByUsername(String usernam);

    Set<String> getPremissionsByUsername(String usernam);

    //-------------
    JsonResult add()throws ArithmeticException;
    JsonResult del()throws ArithmeticException;
    JsonResult upd()throws ArithmeticException;
    JsonResult query()throws ArithmeticException;
}
