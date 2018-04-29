package _DONE.StringRepeat;

/**
 * Created by AlonH on 11/06/2017.
 */

public class Solution {
    public static String repeatStr(final int repeat, final String string) {

        if(repeat < 1) {
            return "";
        }

        String str = "";
        for(int i = 1; i <= repeat; i++) {
            str = str.concat(string);
        }
        return str;
    }
}
