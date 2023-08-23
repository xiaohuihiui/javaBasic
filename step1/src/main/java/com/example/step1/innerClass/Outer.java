package com.example.step1.innerClass;

public class Outer {
    class Inner1 {
    }
    Inner1 i = new Inner1(); // 不需要创建外部类实例
    public void method1() {
        Inner1 i = new Inner1(); // 不需要创建外部类实例
    }
    public static void method2() {
        // 需要创建外部类实例
    }
    class Inner2 {
        Inner1 i = new Inner1(); // 不需要创建外部类实例
    }

    public class Inner {
    }
}
class OtherClass {
    Outer.Inner i = new Outer().new Inner(); // 需要创建外部类实例
}