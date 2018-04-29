package IddanQs.Main.Week4.Q2;

import java.util.Scanner;

public class ManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeJar coffeeJar = new CoffeeJar();
        SugarJar sugarJar = new SugarJar();
        int sugarSpoons, coffeeSpoons;

        do {
            System.out.println("How many spoons of coffee would you like in your coffee? ");
            coffeeSpoons = scanner.nextInt();
            System.out.println("How many spoons of sugar would you like in your coffee? ");
//            scanner.nextInt()
            sugarSpoons = scanner.nextInt();
            coffeeJar.use(coffeeSpoons);
            sugarJar.use(sugarSpoons);

            System.out.println("To make another cap of coffee press any key, to exit type \"exit\"");

        } while(! scanner.next().matches("exit"));


    }
}
