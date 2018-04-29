package IddanQs.Main.Week4.Q2;

/**
 * Created by AlonH on 29/05/2017.
 */
public interface Jar {

//    enum quantityType {
//        spoons, liter, Oz
//    }

    int MAX_AMOUNT = 100;
    int MIN_AMOUNT = 0;

    boolean shouldOrderRefill();
    void orderRefill();
    void use(int amountToUse);
}
