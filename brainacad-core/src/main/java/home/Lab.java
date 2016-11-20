package home;

import java.util.Arrays;

/**
 * Created by Alex on 19.11.2016.
 */
public class Lab {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Rect("green");
        arr[1] = new Rect("red");
        arr[2] = new Circle("white");

        //Arrays.stream(arr).forEach(System.out::println);
//        for (Shape shape: arr          ) {
//            System.out.println(shape);
//        }
//

        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr);

//        for (int i = 0; i < arr.length; i++) {
//            Shape shape = arr[i];
//            System.out.println("" + shape + ": " + shape.calcSquare());
//        }
//
//        for (Shape shape : arr) {
//            System.out.println("" + shape + ": " + shape.calcSquare());
//        }


    }
}
