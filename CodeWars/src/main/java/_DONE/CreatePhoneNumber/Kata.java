package _DONE.CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String number = String.format("(xxx) xxx-xxxx");
        for (int i = 0; i < numbers.length; i++) {
            number = number.replaceFirst("x", String.valueOf(numbers[i]));
        }
        return number;
    }
}