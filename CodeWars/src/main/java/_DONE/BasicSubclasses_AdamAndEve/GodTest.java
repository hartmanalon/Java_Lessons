package _DONE.BasicSubclasses_AdamAndEve;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}