package code2;

import java.util.Scanner;
import java.util.Set;

public class test12 {

    public static void main(String[] args) {

        Set keySet = CityMap.model.keySet();
        for(Object s : keySet) {
            System.out.print(s + "\t");
        }
        System.out.println();
        System.out.println("：");
        Scanner scan = new Scanner(System.in);
        String province = scan.next();

        String[] citys = (String[])CityMap.model.get(province);
        for(String city : citys) {
            System.out.print(city + "\t");
        }
        System.out.println();
        System.out.println("：");
        String city = scan.next();

        System.out.println("");
    }
}
