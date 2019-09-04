package com.xtkj.controller;

import com.xtkj.service.UserService;
import com.xtkj.utils.JsonResult;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("userMsg/add")
    public JsonResult add() {
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult = userService.add();
        } catch (ArithmeticException e) {
            jsonResult.setMsg("权限不足");
        }
        return jsonResult;
    }

    /**
     * 注解式验证权限
     *
     * @return
     */
    @RequiresRoles(value = {"admin"})
    @RequestMapping("userMsg/del")
    public JsonResult del() {
        JsonResult jsonResult = new JsonResult();

        jsonResult = userService.del();

        return jsonResult;
    }

    /**
     * 编程验证  验证的代码在serviceImpl里面。
     * @return
     */
    @RequestMapping("userMsg/upd")
    public JsonResult upd() {
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult = userService.upd();
        } catch (UnauthorizedException e) {
            jsonResult.setMsg("权限不足");
        } catch (AuthorizationException e) {
            jsonResult.setMsg("权限获取失败");
        }
        return jsonResult;
    }

    @RequestMapping("userMsg/query")
    public JsonResult query() {
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult = userService.query();
        } catch (ArithmeticException e) {
            jsonResult.setMsg("权限不足");
        }
        return jsonResult;
    }
}
