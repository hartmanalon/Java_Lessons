package TenPinBowling;

/**
 * Created by AlonH on 21/06/2017.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;


public class SolutionTest {

    @Test
    public void BasicTests() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(20, Solution.bowling_score("11 11 11 11 11 11 11 11 11 11"));

        System.out.println("Woah! Perfect game!");
        assertEquals(300, Solution.bowling_score("X X X X X X X X X XXX"));
    }
}