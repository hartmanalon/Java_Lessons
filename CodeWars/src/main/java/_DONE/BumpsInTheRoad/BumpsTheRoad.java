package _DONE.BumpsInTheRoad;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        int numOfBumps = 0;
        char[] roadArr = road.toCharArray();
        for(int i = 0; i < roadArr.length; i++) {
            if(roadArr[i] == 'n')
                numOfBumps++;
        }
        return numOfBumps <= 15 ? "Woohoo!" : "Car Dead";

//        another option is:
//        return road.chars().filter(c -> c == 'n').count() <= 15 ? "Woohoo!" : "Car Dead";
    }
}