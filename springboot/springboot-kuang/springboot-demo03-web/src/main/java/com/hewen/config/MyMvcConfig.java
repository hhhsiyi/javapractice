package com.hewen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//全面拓展MVC
@Configuration
@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {
    /**
     * 扩展SpringMVC方式
     */
    //如果你想自定义一些东西，只需要写好这个组件，然后将之交给SpringBoot，SpringBoot会帮我们自动装配
//    @Bean//viewResolver实现了视图解析器接口的类，我们就可以把他看做视图解析器
//    public ViewResolver myViewResolver()
//    {
//        return new MyViewResolver();
//    }
//
//    //自定义一个视图解析器
//    public static class MyViewResolver implements ViewResolver{
//        @Override
//        public View resolveViewName(String viewName, Locale locale)throws Exception{
//            return null;
//        }
//    }

    /**
     * 重写最简单的视图跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hehe").setViewName("test");
    }
}
