package com.star.ocean.common.realms;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @ClassName UserRealm
 * @Description TODE
 * @Author 万超超
 * @Date 2021/8/2 20:59
 * @Version 1.0
 **/
public class UserRealm extends AuthorizingRealm {

    /**
     * shiro 使用该方法授权
     * @param principalCollection
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();



        return simpleAuthorizationInfo;
    }

    /**
     * shiro使用该方法认证
     * @param authenticationToken
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;


        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo();
        return simpleAuthenticationInfo;
    }
}
