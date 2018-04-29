package IddanQs.Main.Week3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by AlonH on 10/05/2017.
 */
public class Week3Q1d {

    public void sortList(ArrayList<Integer> list) {

        Collections.sort(list);
        System.out.println("the sorted list is: " + list.toString());
    }

    public int minValue(ArrayList<Integer> list) {

        return Collections.min(list);
    }

    public int maxValue(ArrayList<Integer> list) {

        return Collections.max(list);
    }
}
