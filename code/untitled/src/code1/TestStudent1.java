package code1;

import java.util.Arrays;

public class TestStudent1 {


    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(3, "", 90, 23);
        arr[1] = new Student(1, "", 100, 22);
        arr[2] = new Student(5, "", 75, 25);
        arr[3] = new Student(4, "", 85, 24);
        arr[4] = new Student(2, "", 85, 18);


        System.out.println("：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("");
        StudentScoreComparator sc = new StudentScoreComparator();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (sc.compare(arr[j], arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Student[] students = new Student[5];
        students[0] = new Student(3, "", 90, 23);
        students[1] = new Student(1, "", 100, 22);
        students[2] = new Student(5, "", 75, 25);
        students[3] = new Student(4, "", 85, 24);
        students[4] = new Student(2, "", 85, 18);

        System.out.println(Arrays.toString(students));
        //
        StudentScoreComparator sc1 = new StudentScoreComparator();
        Arrays.sort(students, sc1);
        System.out.println("：");
        System.out.println(Arrays.toString(students));


}
}