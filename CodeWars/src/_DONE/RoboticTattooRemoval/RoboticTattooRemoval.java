package _DONE.RoboticTattooRemoval;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j< skinScan[i].length; j++) {
                if (skinScan[i][j].matches("X")) {
                    skinScan[i][j] = skinScan[i][j].replaceFirst("X", "*");
                }
            }
        }
        return skinScan;
    }
}
