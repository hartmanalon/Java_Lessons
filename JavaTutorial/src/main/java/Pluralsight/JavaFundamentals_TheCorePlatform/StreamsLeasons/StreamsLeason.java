package Pluralsight.JavaFundamentals_TheCorePlatform.StreamsLeasons;

import java.io.IOException;
import java.io.InputStream;

public class StreamsLeason {

    public static void main(String[] args) throws IOException {
        InputStream input = null;
        int intVal;
        while ((intVal = input.read()) >= 0) {
//            byte byteVal - (byte) intVal;
            // do something with byteVal
        }
    }
}
