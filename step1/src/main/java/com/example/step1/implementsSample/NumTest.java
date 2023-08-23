package com.example.step1.implementsSample;

public class NumTest {
    public static void main(String[] args) {
        // 创建实现类的对象
        MathClass calc = new MathClass(100, 300);
        System.out.println("100 和 300 相加结果是：" + calc.sum());
        System.out.println("100 比较 300，哪个大：" + calc.maxNum(100, 300));
    }


}



