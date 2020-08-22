package com.hewen.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.handler.DefaultWebFilterChain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        //添加shiro内置的过滤器
        /**
         * anon:无需认证就能访问的
         * authc:必须认证了才能访问的
         * user:必须拥有“记住我”功能才能使用的
         * perms：拥有对某个资源    的权限才能访问
         * role：拥有某个角色权限才能访问
         */
        //拦截
        Map<String,String > filterMap = new LinkedHashMap<>();
        //权限，授权,没授权的时候应该挑到对应的页面
        filterMap.put("/user/add","perms[user:add]");
        filterMap.put("/user/update","perms[user:update]");
//        filterMap.put("/user/add","authc");
//        filterMap.put("/user/update","authc");
        filterMap.put("/user/*","authc");

        bean.setFilterChainDefinitionMap(filterMap);
        //设置登陆的请求
        bean.setLoginUrl("/toLogin");
        //设置未授权的请求跳转页面
        bean.setUnauthorizedUrl("/noauth");
        return bean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean//自己写的类就放进去了，bean之后就被托管了
    //@Bean(name = "userRealm")这个是不常用的方法
    public UserRealm userRealm(){
        return new UserRealm();
    }
    //整合shiro   dialect：方言 用来整合Thymeleaf和shiro
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
