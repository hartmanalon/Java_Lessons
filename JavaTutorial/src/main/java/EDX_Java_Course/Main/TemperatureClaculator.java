package EDX_Java_Course.Main;

/**
 * Created by AlonH on 27/04/2017.
 */
public class TemperatureClaculator {

    public static int celsiusToFahrenheit(int cTemp) {

        return cTemp*9/5+32;
    }

    public static int fahrenheitToCelsius(int fTemp) {

        return (int)(fTemp-32)*5/9;
    }
}
