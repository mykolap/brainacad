package com.brainacad.module2.lesson8;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alex on 13.11.2016.
 */
public class ClassWork {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder("start");
//        stringBuilder.replace(2,4, "bbcc");
//        for (int i = 0; i < 100; i++) {
//            stringBuilder.append(i);
//            stringBuilder.append(" ");
//        }
//        System.out.println(stringBuilder);

//        StringBuffer stringBuffer = new StringBuffer("start");
//        for (int i = 0; i < 100; i++) {
//            stringBuffer.append(i);
//            stringBuffer.append(" ");
//        }
//        stringBuffer.delete(2, 5);
//        System.out.println(stringBuffer);

//        StringTokenizer stringTokenizer = new StringTokenizer("mystr:blabla:oy", ":");
//        System.out.println(stringTokenizer.countTokens());
//        while (stringTokenizer.hasMoreElements()) {
//            System.out.println(stringTokenizer.nextElement());
//        }
//

//        String str = "say \"Hello\"";
//        System.out.println(str);
        Pattern pattern = Pattern.compile("m(\\d+)o(\\d+)");

        Matcher matcher = pattern.matcher("m22o15");
        System.out.println(matcher.matches());

        System.out.println(matcher.groupCount());
        String module = matcher.group(1);
        String object = matcher.group(2);

        System.out.println(module);
        System.out.println(object);


//
//        matcher = pattern.matcher("myemail@local.com12");
//        System.out.println(matcher.matches());
//
//        matcher = pattern.matcher("myemail@local.com123");
//        System.out.println(matcher.matches());

//        System.out.println(matcher.find());

//        Matcher matcher2 = pattern.matcher("mystr");
//        System.out.println(matcher2.matches());
//        System.out.println(matcher2.find());
    }
}
