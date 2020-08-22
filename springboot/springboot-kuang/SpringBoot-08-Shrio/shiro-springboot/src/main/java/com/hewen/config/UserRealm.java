package com.hewen.config;

//自定义realm

import com.hewen.pojo.User;
import com.hewen.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm{
    @Autowired
    UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermission("user:add");
        //拿到当前的用户对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();

        //设置权限，这个权限是从数据库里获取的
        info.addStringPermission(currentUser.getPerms());
        return info;
    }
//认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了认证");
        //用户名密码，数据库中取
//        String username = "root";
//
//        String password = "123456";
        //用户名和密码从真实的数据库中读取
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
//        if(!userToken.getUsername().equals(username)){
//            return null;//抛出异常unknownAccountException
//        }
        User user = userService.queryUserByName(userToken.getUsername());
        if(user==null){
            return null;//爆出未知用户名错误
        }
        Subject currentSubject = SecurityUtils.getSubject();
        Session session = currentSubject.getSession();
        session.setAttribute("loginSuccessfully",user);
        //密码认证不会给你看的shiro自动做了嗷
        return new SimpleAuthenticationInfo(user,user.getPwd(),"");
    }
}
