package com.xtkj.controller;

import com.xtkj.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping("login")
    public String login(){
        log.info("============login============>");
        return "login";
    }
    @RequestMapping("index")
    public String index(){
        log.info("============index============>");
        return "index";
    }

    @RequestMapping("login/checkLogin")
    public ModelAndView checkLogin(String username, String userpwd){
        ModelAndView modelAndView= new ModelAndView();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token =new UsernamePasswordToken(username,userpwd);
        String view = "redirect:/index";
        String msg= "";
        try {
            subject.login(token);
        }catch (UnknownAccountException e){
            view="/login";
            msg="账号不存在";
        }catch (IncorrectCredentialsException e){
            view="/login";
            msg="密码错误";
        }catch (AuthenticationException e){
            view="/login";
            msg="登入失败";
        }
        modelAndView.setViewName(view);
        if (StringUtils.isNotBlank(msg))
            modelAndView.addObject("msg",msg);
        return modelAndView;
    }

}
