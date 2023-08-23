package com.example.step1;

public class Test {

    public static void main(String[] args) {
       Figure figure; // 声明Figure类的变量
        figure = new Rectangle(9, 9);
        System.out.println(figure.area());
        System.out.println("===============================");
        figure = new Triangle(6, 8);
        System.out.println(figure.area());
        System.out.println("===============================");
        figure = new Figure(10, 10);
        System.out.println(figure.area());

        Integer integer = Integer.valueOf(1);
        System.out.println(integer instanceof  Integer);    // true

    }
}
