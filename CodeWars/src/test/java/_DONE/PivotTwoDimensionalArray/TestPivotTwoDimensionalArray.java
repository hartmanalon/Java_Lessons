package _DONE.PivotTwoDimensionalArray;

import org.junit.Test;

import java.util.Scanner;

public class TestPivotTwoDimensionalArray {

    int[][] source;
    int[][] target;
    int numOfRows = 2;
    int numOfCols = 3;


    public void createArray() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please set number of rows: ");
//        numOfRows = scanner.nextInt();
//        System.out.println("Please set number of columns: ");
//        numOfCols = scanner.nextInt();
        source = new int[numOfRows][numOfCols];

        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                source[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    @Test
    public void test() {
        createArray();
        printArray(source);
        PivotTwoDimensionalArray pivotTwoDimensionalArray = new PivotTwoDimensionalArray();
        target = pivotTwoDimensionalArray.pivotArray(source);
        printArray(target);

    }


    public void printArray(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}