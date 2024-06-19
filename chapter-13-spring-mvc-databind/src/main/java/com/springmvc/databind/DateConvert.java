package com.springmvc.databind;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 这里使用的Converter来实现，实际上也可以使用org.springframework.format.Formatter来实现
public class DateConvert implements Converter<String, Date> {
    private String datePattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source){
        SimpleDateFormat sdf =new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            throw  new IllegalArgumentException("无效的日期格式");
        }
    }

}
