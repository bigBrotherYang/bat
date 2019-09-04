package com.xtkj.service.impl;

import com.xtkj.dao.UserMapper;
import com.xtkj.service.UserService;
import com.xtkj.utils.JsonResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUsernameByPwd(String username) {

        return userMapper.getpwd(username);
    }

    @Override
    public Set<String> getRoleByUsername(String usernam) {
        return userMapper.getRoleByUsername(usernam);
    }

    @Override
    public Set<String> getPremissionsByUsername(String usernam) {
        return userMapper.getPremissionsByUsername(usernam);
    }

    @Override
    public JsonResult add() throws ArithmeticException {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMsg("Ok");
        return jsonResult;
    }


    @Override
    public JsonResult del() throws ArithmeticException {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMsg("Ok");
        return jsonResult;
    }

    //编程式 检测权限
    @Override
    public JsonResult upd() throws ArithmeticException {
        Subject subject = SecurityUtils.getSubject();
        subject.checkRole("admin");
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMsg("Ok");
        return jsonResult;
    }

    @Override
    public JsonResult query() throws ArithmeticException {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMsg("Ok");
        return jsonResult;
    }
}
