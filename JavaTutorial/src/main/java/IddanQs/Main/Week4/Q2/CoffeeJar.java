package IddanQs.Main.Week4.Q2;

public class CoffeeJar implements Jar {

    private static int currentAmount;

    CoffeeJar() {
        currentAmount = MAX_AMOUNT;
    }

    @Override
    public boolean shouldOrderRefill() {
        return currentAmount < (MAX_AMOUNT / 2);
    }

    @Override
    public void orderRefill() {

        if(shouldOrderRefill()) {
            System.out.println("needs to refill because current amount is: " + currentAmount);
            currentAmount = MAX_AMOUNT;
        }
        System.out.println("the new current amount of Coffee is: " + currentAmount);
    }

    @Override
    public void use(int amountToUse) {

        if(amountToUse > MAX_AMOUNT || amountToUse < MIN_AMOUNT) {
            return;
        }
        currentAmount = currentAmount - amountToUse;
        orderRefill();
    }

}
