package com.example.step1.abstractClass;

public class ShapeTest {
    public static void main(String[] args) {
       Square square = new Square(5, 4); // 
        System.out.println("：" + square.area());
        Triangle triangle = new Triangle(2, 5); // 
        System.out.println("：" + triangle.area());
    }
}