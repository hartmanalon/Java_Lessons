package _DONE.MostDigits;

public class MostDigits {
    public static int findLongest(int[] numbers) {

        int longest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(longest)).length() < String.valueOf(Math.abs(numbers[i])).length()) {
                longest = numbers[i];
            }
        }
        return longest;
    }
}