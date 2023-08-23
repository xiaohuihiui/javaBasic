package com.example.step1.abstractClass;

public class ShapeTest {
    public static void main(String[] args) {
       Square square = new Square(5, 4); // 创建正方形类对象
        System.out.println("正方形的面积为：" + square.area());
        Triangle triangle = new Triangle(2, 5); // 创建三角形类对象
        System.out.println("三角形的面积为：" + triangle.area());
    }
}