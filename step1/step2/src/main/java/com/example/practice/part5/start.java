package com.example.practice.part5;

public class start {

    public static void main(String[] args) {
        //static
        int [] arrs =new int[]{1,2,3,4};
        int [] arss={1,34,34};
        //dyama
        int [] start=new int[3];
        //legth
        System.out.println(arrs.length);
        System.out.println(arrs[0]);
        for (int i=0;i<arrs.length;i++){

            System.out.println(arrs[i]);

        }

        // 定义数组，存储3个元素
        int[] arr = new int[3];
        //数组索引进行赋值
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        //输出3个索引上的元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义数组变量arr2，将arr的地址赋值给arr2
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
        System.out.println(arr2[1]);

    }
}
