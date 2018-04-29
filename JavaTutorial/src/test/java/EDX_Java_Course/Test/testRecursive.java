package EDX_Java_Course.Test;

import EDX_Java_Course.Main.Recursive;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by AlonH on 03/05/2017.
 */
public class testRecursive {

    Recursive rec = new Recursive();

    @Test
    public void test0() {

        assertEquals("2 power of 0 should be 1", 1, rec.power(2, 0));
    }

    @Test
    public void test1() {

        assertEquals("2 power of 0 should be 2", 2, rec.power(2, 1));
    }

    @Test
    public void test2() {

        assertEquals("2 power of 0 should be 4", 4, rec.power(2, 2));
    }

    @Test
    public void test3() {

        assertEquals("2 power of 0 should be 8", 8, rec.power(2, 3));
    }

    @Test
    public void test4() {

        assertEquals("2 power of 0 should be 16", 16, rec.power(2, 4));
    }

    @Test
    public void test5() {

        assertEquals("2 power of 0 should be 32", 32, rec.power(2, 5));
    }

    @Test
    public void test6() {

        assertEquals("2 power of 0 should be 64", 64, rec.power(2, 6));
    }

    @Test
    public void test7() {

        assertEquals("2 power of 0 should be 128", 128, rec.power(2, 7));
    }

    @Test
    public void test8() {

        assertEquals("2 power of 0 should be 256", 256, rec.power(2, 8));
    }

    @Test
    public void test9() {

        assertEquals("2 power of 0 should be 512", 512, rec.power(2, 9));
    }

    @Test
    public void test10() {

        assertEquals("2 power of 0 should be 1024", 1024, rec.power(2, 10));
    }

    @Test
    public void test11() {

        assertEquals("2 power of -1 should fail in calling this method", 0.5, rec.power(2, -1));
    }
}
