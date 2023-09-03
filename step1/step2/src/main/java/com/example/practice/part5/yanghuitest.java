package com.example.practice.part5;

public class yanghuitest {


    public static void main(String[] args) {

        int[][] arrs = new int[10][];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = new int[i + 1];

            arrs[i][0]=1;
            arrs[i][i]=1;
            for (int j=1;j<arrs[i].length-1;j++){

                arrs[i][j]=arrs[i-1][j-1]+arrs[i-1][j];

            }



        }

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.print(arrs[i][j]+" ");
            }


            System.out.println();


        }


    }


}
