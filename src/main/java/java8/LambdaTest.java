package java8;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaTest {


    @Test
    public void testAnonymousClass(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<Integer>(com);

        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(14);

        for (Integer i: treeSet ) {
            System.out.println(i);

        }

    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testUsingLambda(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
    }

}


