package com.swing.tool.datetool;

import com.eltima.components.ui.DatePicker;

import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateResult {

    //获取当前时间
    public String getCurrentTime(){

        SimpleDateFormat ct = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        //System.out.println(ct.format(new Date()));// new Date()为获取当前系统时间
        return ct.format(new Date());

    }

    public static DatePicker getDatePicker() {
        final DatePicker datepick;
        // 格式
        String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
        // 当前时间
        Date date = new Date();
        // 字体
        Font font = new Font("Times New Roman", Font.BOLD, 14);

        Dimension dimension = new Dimension(177, 24);

        int[] hilightDays = { 1, 3, 5, 7 };

        int[] disabledDays = { 4, 6, 5, 9 };
        //构造方法（初始时间，时间显示格式，字体，控件大小）
        datepick = new DatePicker(date, DefaultFormat, font, dimension);

        datepick.setLocation(137, 83);//设置起始位置
        /*
        //也可用setBounds()直接设置大小与位置
        date_pick.setBounds(137, 83, 177, 24);
        */
        // 设置一个月份中需要高亮显示的日子
        datepick.setHightlightdays(hilightDays, Color.red);
        // 设置一个月份中不需要的日子，呈灰色显示
        datepick.setDisableddays(disabledDays);
        // 设置国家
        datepick.setLocale(Locale.CANADA);
        // 设置时钟面板可见
        datepick.setTimePanleVisible(true);
        return datepick;
    }

    public static void main(String[] args) {

        // System.out.println(getCurrentTime());// new Date()为获取当前系统时间
    }
}
