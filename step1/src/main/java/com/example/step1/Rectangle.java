package com.example.step1;



public class Rectangle extends Figure {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        System.out.println("：");
        return super.dim1 * super.dim2;
    }
}