package com.example.step1.abstractClass;


public class Square extends Shape {
    public Square(int width, int height) {
        super(width, height);
    }

    // ，
    @Override
    public double area() {
        return width * height;
    }
}
