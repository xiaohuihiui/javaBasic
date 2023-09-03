package com.example.practice.part5;

public class yanhghui2 {

    public static void main(String[] args) {

        int yanghui[][]=new int[10][];

        for (int i=0;i<yanghui.length;i++){

            yanghui[i]=new int[i+1];

            yanghui[i][0]=yanghui[i][i]=1;
            for (int j=1;j<yanghui[i].length-1;j++){

                yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];

            }

        }


        for (int i=0;i<yanghui.length;i++){
             for (int j=0;j<yanghui[i].length;j++){

                 System.out.print(yanghui[i][j]+" ");


             }


            System.out.println();

        }




    }
}
