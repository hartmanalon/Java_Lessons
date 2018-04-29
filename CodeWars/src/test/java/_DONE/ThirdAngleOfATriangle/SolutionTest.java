package _DONE.ThirdAngleOfATriangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testTriangleAngle() {
        assertEquals(150, Kata.otherAngle(10,20));
        assertEquals(110, Kata.otherAngle(50,20));
        assertEquals(95, Kata.otherAngle(75,10));
        assertEquals(32, Kata.otherAngle(60,88));
    }
}
