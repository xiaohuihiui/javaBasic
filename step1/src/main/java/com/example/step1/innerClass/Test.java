package com.example.step1.innerClass;

public class Test {
    public class InnerClass {
        public int getSum(int x,int y) {
            return x + y;
        }
    }
    public static void main(String[] args) {
        Test.InnerClass ti = new Test().new InnerClass();
        int i = ti.getSum(2,3);
        System.out.println(i);    // 5
    }
}