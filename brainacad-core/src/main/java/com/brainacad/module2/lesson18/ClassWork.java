package com.brainacad.module2.lesson18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

/**
 * Created by Admin on 12/10/2016.
 */
public class ClassWork {

    public static void main(String[] args) {
        BigInteger bi = new BigInteger("55");
        System.out.println(bi);

        BigInteger bi2 = new BigInteger("5");

        System.out.println(bi.add(bi2));
        BigInteger bi3 = new BigInteger("11", 2);

        System.out.println(bi3);

        System.out.println(bi.multiply(bi2).multiply(bi3));

        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigMax = new BigDecimal("1.1");

        for (BigDecimal x = bigDecimal;
             x.compareTo(bigMax) < 0;
             x = x.add(bigDecimal)) {
            System.out.println(x);
        }

        BigDecimal b1 = new BigDecimal("10");
        BigDecimal b2 = new BigDecimal("3");

        BigDecimal b3 = b1.divide(b2, MathContext.DECIMAL32);
        System.out.println(b3);

        Random random = new Random(55);
        System.out.println(random.nextInt(100));

        System.err.println("something bad happened");

        for (Map.Entry<String, String> s : System.getenv().entrySet()) {
            System.out.println("key - " + s.getKey() + ", value - " + s.getValue());
        }

        String OS = System.getenv("OS");
        System.out.println(OS);
        if (OS.toLowerCase().contains("windows")) {
            System.out.println("Yes, we are on windows");
        }

        System.out.println("Hello " + System.getenv("USERNAME"));

        Properties properties = new Properties();
        properties.put("db.name", "mydb");
        properties.put("db.login", "mylogin");
        properties.put("db.password", "mypass");

        System.out.println(properties.get("db.name"));



    }

}
