package _DONE.CountingSheeps;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        if (arrayOfSheeps != null && arrayOfSheeps.length > 0) {
            for (Boolean sheep : arrayOfSheeps) {
                if (sheep != null && sheep) {
                    count++;
                }
            }
        }
        return count;
    }
}