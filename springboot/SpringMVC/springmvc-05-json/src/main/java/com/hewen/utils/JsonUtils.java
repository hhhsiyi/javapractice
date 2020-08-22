package com.hewen.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Json工具类，封装了一些基本用法，用于测试嗷
 * @author Hewen
 *
 */
public class JsonUtils {
    /**
     * 重载，解决日期格式化问题
     * @param object
     * @return
     */
    public static String getJsonDate(Object object) {
        return getJsonDate(object,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJsonDate(Object object,String dateFormat) {
        ObjectMapper objectMapper = new ObjectMapper();
        //1.就是这样关闭时间戳
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);
        //2.自定义日期格式对象
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        //3.让mapper指定时间日期格式为指定格式对象
        objectMapper.setDateFormat(simpleDateFormat);
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        //如何让他不返回时间戳，时间的格式化问题
        //时间默认返回的json格式字符串变成了时间戳的格式，timestamp
        //直接输出是在tomcat服务器控制台输出，而不是在网页上输出，是通过下面的返回，输出在网页上的
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}

