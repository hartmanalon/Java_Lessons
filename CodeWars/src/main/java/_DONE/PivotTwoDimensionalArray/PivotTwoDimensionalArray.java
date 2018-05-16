package _DONE.PivotTwoDimensionalArray;

public class PivotTwoDimensionalArray {


    public int[][] pivotArray(int[][] source) {
        int[][] target = new int[source[0].length][source.length];

        for(int row = 0; row < target.length; row++) {
            for(int col = 0; col < target[0].length; col++) {
                target[col][row] = source[row][col];
            }
        }
        return target;
    }
}
