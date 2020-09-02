package com.Practice;
import java.util.Date;
import java.text.*;

public class DateParactice {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat fdate=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.print("当前时间是："+fdate.format(date));

    }
}
