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

        // ，3
        int[] arr = new int[3];
        //
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        //3
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //arr2，arrarr2
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
        System.out.println(arr2[1]);

    }
}
