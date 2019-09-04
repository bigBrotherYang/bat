package com.xtkj.config;

import com.alibaba.fastjson.JSONObject;
import com.xtkj.utils.JsonResult;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseBody
    public JsonResult defaultExceptionHandler(HttpServletRequest req, Exception e) {
        JsonResult jsonUtils = new JsonResult();
        jsonUtils.setMsg("对不起，当前角色不允许访问");
        jsonUtils.setErrorCode("500");
//        String json = JSONObject.toJSONString(jsonUtils);
        return jsonUtils;
    }

//    @ExceptionHandler(UnauthorizedException.class)
//    @ResponseBody
//    public String defaultExceptionHandler1(HttpServletRequest req, Exception e) {
//        JsonResult jsonUtils = new JsonResult();
//        jsonUtils.setMsg("对不起，当前角色不允许访问该方法");
//        jsonUtils.setErrorCode("500");
//        String json = JSONObject.toJSONString(jsonUtils);
//        return "successCallback("+json+")";
//    }
}
