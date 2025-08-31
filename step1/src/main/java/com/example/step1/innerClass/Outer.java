package com.example.step1.innerClass;

public class Outer {
    class Inner1 {
    }
    Inner1 i = new Inner1(); // 
    public void method1() {
        Inner1 i = new Inner1(); // 
    }
    public static void method2() {
        // 
    }
    class Inner2 {
        Inner1 i = new Inner1(); // 
    }

    public class Inner {
    }
}
class OtherClass {
    Outer.Inner i = new Outer().new Inner(); // 
}