package FindUnique.FindUniqueNumber;

import java.util.Arrays;

// Make sure your class is public
public class Kata {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if (arr[arr.length-1] == arr[arr.length-2])
            return arr[0];
        return arr[arr.length-1];
    }
}