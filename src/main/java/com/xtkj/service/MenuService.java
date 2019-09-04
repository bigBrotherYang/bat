package com.xtkj.service;

import com.xtkj.pojo.Menu;

import java.util.Set;

public interface MenuService {
    Set<Menu> getRoleNmaeByMenu(String username);
}
