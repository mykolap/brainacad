package home;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Alex on 19.11.2016.
 */
public class WrappersNumbers {
    public static void main(String[] args) {
//        Number[] numbers = new Number[3];
//        numbers[0] = Byte.valueOf((byte)5);
//        numbers[1] = Integer.valueOf(1000);
//        numbers[2] = Double.valueOf(2.0d);
//        System.out.println(Arrays.toString(numbers));
//
//        for (int i = 0; i < numbers.length; i++) {
//            printInt(numbers[i].doubleValue());
//
////            System.out.println(numbers[i]);
//        }

//        int maxInt = Integer.MAX_VALUE;
//        System.out.println(maxInt);
//
//        System.out.println(Integer.toBinaryString(3));
//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(1));
//
//        System.out.println(3|2);
//        System.out.println(1|2);
//
//        Integer.valueOf(5);
//
        int a = 5;
        Integer b = new Integer(10);
        b = 10;
        b = Integer.valueOf(10);

        a = b; //unboxing
        b = a; //autoboxing
        //2_147_483_647

    }

    static void printInt(double intValue) {
        System.out.println(intValue);
    }
}
