package code1;

public class StringTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "tom";

        Person p2 = new Person();
        p2.name =  "tom";

        System.out.println(p1.name.equals( p2.name)); //
        System.out.println(p1.name == p2.name); //
        System.out.println(p1.name == "Tom"); //

        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);




    }
}
