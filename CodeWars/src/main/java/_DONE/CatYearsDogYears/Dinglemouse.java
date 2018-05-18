package _DONE.CatYearsDogYears;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;

        if (humanYears == 2) {
            catYears += 9;
            dogYears += 9;
        }
        if (humanYears > 2) {
            catYears += 9;
            dogYears += 9;
            for(int i = 2; i < humanYears; i++) {
                catYears += 4;
                dogYears += 5;

            }
        }

        return new int[]{humanYears,catYears,dogYears};
    }


    // Alternet answer
    public static int[] humanYearsCatYearsDogYears2(final int humanYears) {
        int catYears =0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
        return new int[]{humanYears, catYears, dogYears};
    }


}