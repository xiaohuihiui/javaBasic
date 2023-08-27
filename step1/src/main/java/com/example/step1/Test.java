package com.example.step1;

public class Test {

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i); // 10
        System.out.println("i1="+i1);// 11
        i = ++i1;
        System.out.print("i="+i);// 12
        System.out.println("i1="+i1);//12
        i = i2--;
        System.out.print("i="+i);// 12
        System.out.println("i2="+i2);// 19
        i = --i2;
        System.out.print("i="+i);// 18
        System.out.println("i2="+i2);// 18

        System.out.println("5+5=" + 5 + 5);

        int i11 = 2;
        int j = i11++;
        System.out.println(j);

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m);


        int c= 2;
        int j12 = c++ + c++; //c++ 本身只不变，次数变，++c都变

        System.out.println("j = " + j12);

        int x = 1,y = 1;

        if(x++ == 2 && ++y == 2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);

    }
}
