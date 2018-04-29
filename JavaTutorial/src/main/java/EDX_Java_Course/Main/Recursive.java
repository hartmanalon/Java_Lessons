package EDX_Java_Course.Main;

/**
 * Created by AlonH on 03/05/2017.
 */
public class Recursive {

    public int power(int x, int y) {

        if (y<0) {
            return -1;
        }
        if (y==0) {
            return 1;
        } else {
            return x * power(x, y - 1);
        }
    }

}
