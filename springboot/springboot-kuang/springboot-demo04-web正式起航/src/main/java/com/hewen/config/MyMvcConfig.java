package com.hewen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//全面拓展MVC
@Configuration
//@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");

    }

    /**
     * 往容器中注入一个组件就是这么简单？？？？简单吗
     * @return 自定义的国际化组件
     */
    @Bean
    public LocaleResolver localeResolver()
    {
        return new MyLocalResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/","/index.html","/user/login","/css/**","/js/**","/img/*");
    }
    //    /**
//     * 扩展SpringMVC方式
//     */
//    //如果你想自定义一些东西，只需要写好这个组件，然后将之交给SpringBoot，SpringBoot会帮我们自动装配
////    @Bean//viewResolver实现了视图解析器接口的类，我们就可以把他看做视图解析器
////    public ViewResolver myViewResolver()
////    {
////        return new MyViewResolver();
////    }
////
////    //自定义一个视图解析器
////    public static class MyViewResolver implements ViewResolver{
////        @Override
////        public View resolveViewName(String viewName, Locale locale)throws Exception{
////            return null;
////        }
////    }
//
//    /**
//     * 重写最简单的视图跳转
//     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/hehe").setViewName("test");
//    }
}
