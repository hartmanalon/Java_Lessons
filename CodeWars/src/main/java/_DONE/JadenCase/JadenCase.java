package _DONE.JadenCase;

/**
 * Created by AlonH on 26/04/2017.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {

        if(phrase == null || phrase.equals("")) {
            return null;
        }
        StringBuffer res = new StringBuffer();

        String[] strArr = phrase.split(" ");
        for (String str : strArr) {
            char[] charArray = str.trim().toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            str = new String(charArray);

            res.append(str).append(" ");
        }

        return res.toString().trim();
    }

}