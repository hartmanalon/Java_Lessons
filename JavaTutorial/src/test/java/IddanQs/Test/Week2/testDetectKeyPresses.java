package IddanQs.Test.Week2;

import IddanQs.Main.Week2.DetectKeyPresses;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by AlonH on 30/04/2017.
 */
public class testDetectKeyPresses {

    DetectKeyPresses dkp = new DetectKeyPresses();

    @Test
    public void test1() {

        assertTrue("number is not valid", dkp.detectKey(0));
    }

    @Test
    public void test2() {

        int x=-1;
        assertFalse("number is not valid", dkp.detectKey(x));
    }

    @Test
    public void test3() {

        assertTrue("number is not valid", dkp.detectKey(9));
    }

    @Test
    public void test4() {

        assertFalse("number is not valid", dkp.detectKey(10));
    }

}
