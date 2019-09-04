package com.xtkj.service.impl;

import com.xtkj.dao.MenuMapper;
import com.xtkj.pojo.Menu;
import com.xtkj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public Set<Menu> getRoleNmaeByMenu(String username) {
        return menuMapper.getRoleNmaeByMenu(username);
    }
}
