package com.example.step1.abstractClass;

public class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }
    // ，
    @Override
    public double area() {
        return 0.5 * width * height;
    }
}