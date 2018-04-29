package _DONE.InspiringStrings;

public class Kata {
    public static String longestWord(String wordString) {

        String[] words = wordString.split(" ");
        int index = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[index].length() <= words[i].length()) {
                index = i;
            }
        }
        return words[index];
    }
}