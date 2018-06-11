package _DONE.SurfaceAreaAndVolumeOfABox;

public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int[] arr = new int[2];
        arr[0] = (w*h)+(w*h)+(w*d)+(w*d)+(h*d)+(h*d);
        arr[1] = w * h * d;
        return arr;
    }
}