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
        System.out.println("请选择你所在的省份：");
        Scanner scan = new Scanner(System.in);
        String province = scan.next();

        String[] citys = (String[])CityMap.model.get(province);
        for(String city : citys) {
            System.out.print(city + "\t");
        }
        System.out.println();
        System.out.println("请选择你所在的城市：");
        String city = scan.next();

        System.out.println("信息登记完毕");
    }
}
