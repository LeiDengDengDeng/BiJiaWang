package com.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

   public static java.sql.Date getTodayDateSQL(){
       Date today=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       String sDate=sdf.format(today);
       java.sql.Date result= java.sql.Date.valueOf(sDate);

       return result;
   }

}
