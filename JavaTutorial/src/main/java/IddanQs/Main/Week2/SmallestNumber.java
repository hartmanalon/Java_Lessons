package IddanQs.Main.Week2;

/**
 * Created by AlonH on 30/04/2017.
 */
public class SmallestNumber {

    public int findSmallestNumer(int a, int b, int c) {

        int min = Integer.min(a,b);
        min = Integer.min(min, c);
        return min;
    }

}
