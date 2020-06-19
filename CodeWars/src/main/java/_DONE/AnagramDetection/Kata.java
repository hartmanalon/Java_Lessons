package _DONE.AnagramDetection;

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        char[] originalarr = original.toLowerCase().toCharArray();
        char[] testarr = test.toLowerCase().toCharArray();
        Arrays.sort(originalarr);
        Arrays.sort(testarr);
        return Arrays.equals(originalarr, testarr);
    }
}