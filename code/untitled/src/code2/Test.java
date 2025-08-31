package code2;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        test02();
    }



    public static void test02() {
        Student[] students = new Student[3];
        students[0] = new Student("", 96);
        students[1] = new Student("", 85);
        students[2] = new Student("", 98);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
