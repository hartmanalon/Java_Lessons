package _DONE.ANeedleInTheHaystack;

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        int index;
        boolean found = false;
        for(index = 0; index < haystack.length && !found; index++) {
            if(haystack[index] != null && haystack[index].toString().equals("needle"))
                found = true;
        }
//        return("found the needle at position " + (index-1));

//        another option is:
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}

