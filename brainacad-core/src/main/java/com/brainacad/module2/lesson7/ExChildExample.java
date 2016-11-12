package com.brainacad.module2.lesson7;

import java.util.Arrays;

/**
 * Created by Alex on 12.11.2016.
 */
public class ExChildExample extends EqualsExample implements Cloneable {
    public ExChildExample[] arr;
    public int a;
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        ExChildExample exChildExample = new ExChildExample();
        exChildExample.arr = new ExChildExample[this.arr.length];
        for (int i = 0; i < arr.length; i++) {
            exChildExample.arr[i] = (ExChildExample) this.arr[i].clone();
        }
        for (Object obj :
                this.arr) {

        }
        //exChildExample.arr = Arrays.copyOf(this.arr, this.arr.length);
        exChildExample.a = this.a;
        return exChildExample;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ExChildExample exChildExample = new ExChildExample();
        //exChildExample.arr = new int[] { 1,1,1};
        exChildExample.a = 2;

        ExChildExample exChildExample2 = (ExChildExample) exChildExample.clone();

        System.out.println(Arrays.toString(exChildExample.arr));
        System.out.println(Arrays.toString(exChildExample2.arr));

        //exChildExample.arr[1] = 2;
        exChildExample.a = 5;

        System.out.println(Arrays.toString(exChildExample.arr));
        System.out.println(Arrays.toString(exChildExample2.arr));
    }
}
