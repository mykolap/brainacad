package com.brainacad.module2.lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by Admin on 12/10/2016.
 */
public class PropertyWork {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream fileInputStream = ClassLoader.getSystemResourceAsStream("db.properties")) {
            properties.load(fileInputStream);
            String dbName = properties.getProperty("db.name");
            String dbLogin = properties.getProperty("db.login");
            String dbPass = properties.getProperty("db.password");
            System.out.println("name " + dbName + ", login " + dbLogin + ", pass " + dbPass);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Locale locale = Locale.getDefault();

        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(1254645785144.25);
        System.out.println(str);

        numberFormat = NumberFormat.getInstance(Locale.CHINESE);
        System.out.println(numberFormat.format(1254645785144.25));

        numberFormat = NumberFormat.getInstance(Locale.US);
        System.out.println(numberFormat.format(1254645785144.25));

        numberFormat = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(numberFormat.format(1254645785144.25));


        numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINESE);
        System.out.println(numberFormat.format(1254645785144.25));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numberFormat.format(1254645785144.25));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(numberFormat.format(1254645785144.25));

        Locale locale1 = new Locale("ru", "RU");
        numberFormat = NumberFormat.getCurrencyInstance(locale1);
        System.out.println(numberFormat.format(1254645785144.25));

        Locale locale2 = new Locale("ua", "UA");
        numberFormat = NumberFormat.getCurrencyInstance(locale2);
        System.out.println(numberFormat.format(1254645785144.25));

        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        date.setTime(1481381461001L + 24*3600*1000);
        System.out.println(date);
        //date.setTime();

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());

        int[] a = new int[1000000];

        System.out.println(runtime.freeMemory());

        try {
            runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
