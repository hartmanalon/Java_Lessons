package IddanQs.Main.Week2;

/**
 * Created by AlonH on 04/05/2017.
 */
public class SumIntegerDigits {

    public int sumDigits(int num) {

        if(num < 0 || num > 1000) {
            return -1;
        }
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
