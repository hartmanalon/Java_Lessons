package IddanQs.Test.Week2;

import IddanQs.Main.Week2.SmallestNumber;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by AlonH on 30/04/2017.
 */
public class testSmallestNumber {

    SmallestNumber sn = new SmallestNumber();

    @Test
    public void findSmallestNumer() {

        assertTrue("failed to find smallest number!", (sn.findSmallestNumer(75, 37, 29) == 29));
    }
}

