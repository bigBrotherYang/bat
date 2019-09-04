package com.xtkj.utils;

import com.xtkj.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MyRealm extends JdbcRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(userService.getRoleByUsername(username));
        info.setStringPermissions(userService.getPremissionsByUsername(username));
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String principal = (String) token.getPrincipal();
        String userPwd = userService.getUsernameByPwd(principal);
        if (StringUtils.isBlank(userPwd))
            throw new UnknownAccountException("账号不存在");
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, userPwd, ByteSource.Util.bytes("admin"), "realm1");
        return info;
    }
}
