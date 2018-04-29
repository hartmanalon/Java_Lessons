package _DONE.VowelCount;

/**
 * Created by AlonH on 11/06/2017.
 */
public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;

        for(int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowelsCount++;
                break;
            }


// OR
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
//                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
//                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
//                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
//                    str.charAt(i) == 'u' || str.charAt(i) == 'U') {
//                vowelsCount++;
//            }
        }
        return vowelsCount;
    }

}