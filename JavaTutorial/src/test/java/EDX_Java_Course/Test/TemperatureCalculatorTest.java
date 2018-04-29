package EDX_Java_Course.Test;

/**
 * Created by AlonH on 27/04/2017.
 */

import EDX_Java_Course.Main.TemperatureClaculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TemperatureCalculatorTest {

    TemperatureClaculator tc = new TemperatureClaculator();

    @Test
    public void celsiusToFahrenheitTest() {
        assertTrue("result should be 86", TemperatureClaculator.celsiusToFahrenheit(30)==86);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        assertTrue("result should be 30", TemperatureClaculator.fahrenheitToCelsius(86)==30);
    }

}