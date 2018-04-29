package IddanQs.Test.Week3;

import IddanQs.Main.Week3.Week3Q1d;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlonH on 10/05/2017.
 */
public class testWeek3Q1d {

    Week3Q1d w3q = new Week3Q1d();

    List<Integer> testList=new ArrayList<Integer>();

    @Before
    public void before() {
        testList.add(5);
        testList.add(2);
        testList.add(9);
        testList.add(18);
        testList.add(4);
        testList.add(1);
        testList.add(54);
        testList.add(76);
        testList.add(71);
        testList.add(75);
        testList.add(92);
        testList.add(12);
        testList.add(65);
        testList.add(34);
        testList.add(62);
    }

    @Test
    public void testsort() {

        System.out.println("the test list is: " + testList.toString());
        w3q.sortList((ArrayList<Integer>) testList);
    }

    @Test
    public void min() {

        Assert.assertEquals("the min value should be ", 1, w3q.minValue((ArrayList<Integer>) testList));
    }

    @Test
    public void max() {

        Assert.assertEquals("the max value should be ", 92, w3q.maxValue((ArrayList<Integer>) testList));
    }

}
