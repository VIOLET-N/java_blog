package com.blog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static String getNewDate(){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return ft.format(date);
    }
}
