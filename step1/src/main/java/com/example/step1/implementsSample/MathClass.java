package com.example.step1.implementsSample;

public class MathClass implements IMath {
    private int num1;    //  1 
    private int num2;    //  2 
    public MathClass(int num1,int num2) {
        // 
        this.num1 = num1;
        this.num2 = num2;
    }
    // 
    public int sum() {
        return num1 + num2;
    }
    // 
    public int maxNum(int a,int b) {
        if(a >= b) {
            return a;
        } else {
            return b;
        }
    }
}