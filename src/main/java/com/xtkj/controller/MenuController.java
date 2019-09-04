package com.xtkj.controller;

import com.xtkj.service.MenuService;
import com.xtkj.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/getAllMenu")
    @ResponseBody
    public JsonResult getAllMenu(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(menuService.getRoleNmaeByMenu("zhy"));
        return jsonResult;
    }
}
