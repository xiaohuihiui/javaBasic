package com.example.practice.part5;

public class practes2 {


    public static void main(String[] args) {

        //count
        int[][] arrs = new int[5][];

        //low  length
        for (int i = 0; i < arrs.length; i++) {

            arrs[i] = new int[i + 1];
        }


        //write value
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                arrs[i][j] = i + 1;
            }

        }

        //write value
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {

                System.out.print(arrs[i][j] = i + 1);

            }
            System.out.println();
        }




    }

}
