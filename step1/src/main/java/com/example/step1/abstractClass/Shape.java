package com.example.step1.abstractClass;

public abstract class Shape {
    public int width; // 几何图形的长
    public int height; // 几何图形的宽

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract double area(); // 定义抽象方法，计算面积
}