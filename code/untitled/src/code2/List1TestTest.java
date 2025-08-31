package code2;

import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class List1TestTest {

    @Test
    public void testAdd(){
        //ArrayListCollectionList。
        List coll = new ArrayList();
        coll.add("");
        coll.add("");
        coll.add("");
        System.out.println(coll);
    }
    @Test
    public void testAddAll(){
        List c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        System.out.println("c1：" + c1.size());//2
        System.out.println("c1 = " + c1);

        ArrayList c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
        System.out.println("c2：" + c2.size());//2
        System.out.println("c2 = " + c2);

        Collection other = new ArrayList();
        other.add(1);
        other.add(2);
        other.add(3);
        System.out.println("other：" + other.size());//3
        System.out.println("other = " + other);
        System.out.println();



        c2.add(other);
        System.out.println("c2：" + c2.size());//3
        System.out.println("c2.add(other) = " + c2);
        c1.addAll(other);
        System.out.println("c1：" + c1.size());//5
        System.out.println("c1.addAll(other) = " + c1);
    }
    @Test
    public void test02() {
        Collection coll = new ArrayList();
        coll.add("");
        coll.add("");
        coll.add("");
        coll.add("");
        System.out.println("coll = " + coll);
        System.out.println("coll“” = " + coll.contains(""));
        System.out.println("coll“” = " + coll.contains(""));

        Collection other = new ArrayList();
        other.add("");
        other.add("");
        other.add("");
        System.out.println("other = " + other);

        System.out.println("coll.containsAll(other) = " + coll.containsAll(other));
    }
    @Test
    public void test03(){
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        System.out.println("c1：" + c1.size());//2
        System.out.println("c1 = " + c1);

        Collection c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
        System.out.println("c2：" + c2.size());//2
        System.out.println("c2 = " + c2);

        Collection other = new ArrayList();
        other.add(1);
        other.add(2);
        other.add(3);
        System.out.println("other：" + other.size());//3
        System.out.println("other = " + other);
        System.out.println();

        c1.addAll(other);
        System.out.println("c1：" + c1.size());//5
        System.out.println("c1.addAll(other) = " + c1);
        System.out.println("c1.contains(other) = " + c1.contains(other));
        System.out.println("c1.containsAll(other) = " + c1.containsAll(other));
        System.out.println();

        c2.add(other);
        System.out.println("c2：" + c2.size());
        System.out.println("c2.add(other) = " + c2);
        System.out.println("c2.contains(other) = " + c2.contains(other));
        System.out.println("c2.containsAll(other) = " + c2.containsAll(other));
        c2.iterator();

        List list=Arrays.asList();
    }




}