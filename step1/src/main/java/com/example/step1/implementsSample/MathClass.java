package com.example.step1.implementsSample;

public class MathClass implements IMath {
    private int num1;    // 第 1 个操作数
    private int num2;    // 第 2 个操作数
    public MathClass(int num1,int num2) {
        // 构造方法
        this.num1 = num1;
        this.num2 = num2;
    }
    // 实现接口中的求和方法
    public int sum() {
        return num1 + num2;
    }
    // 实现接口中的获取较大数的方法
    public int maxNum(int a,int b) {
        if(a >= b) {
            return a;
        } else {
            return b;
        }
    }
}