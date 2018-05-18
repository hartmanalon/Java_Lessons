package _DONE.ReversedStrings;

public class Kata {

    public static String solution(String str) {
        String rev = "";
        char[] chars = str.toCharArray();
        for(int i = chars.length-1; i>=0; i--) {
            rev = rev + chars[i];
        }
        return rev;
    }
}