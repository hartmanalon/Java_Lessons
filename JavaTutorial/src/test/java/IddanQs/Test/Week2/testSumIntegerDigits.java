package IddanQs.Test.Week2;

import IddanQs.Main.Week2.SumIntegerDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AlonH on 04/05/2017.
 */
public class testSumIntegerDigits {

    SumIntegerDigits sid = new SumIntegerDigits();

    @Test
    public void test1() {
        assertEquals(15, sid.sumDigits(555));
//        assertTrue(sid.sumDigits(555) == 15);
    }

    @Test
    public void test2() {
        assertEquals(1, sid.sumDigits(1000));
    }

    @Test
    public void test3() {
        assertEquals(1, sid.sumDigits(1));
    }

    @Test
    public void test4() {
        assertEquals(0, sid.sumDigits(0));
    }

    @Test
    public void test5() {
        assertEquals(22, sid.sumDigits(499));
    }

    @Test
    public void test6() {
        assertEquals(-1, sid.sumDigits(5000));
    }

    @Test
    public void test7() {
        assertEquals(-1, sid.sumDigits(-5));
    }
}
