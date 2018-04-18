package _DONE.InspiringStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleKataTests {
    @Test
    public void tests1() {
        assertEquals("fgh", Kata.longestWord("a b c d e fgh"));
    }

    @Test
    public void tests2() {
        assertEquals("three", Kata.longestWord("one two three"));
    }

    @Test
    public void tests3() {
        assertEquals("grey", Kata.longestWord("red blue grey"));
    }
}