package IddanQs.Main.Week2;

/**
 * Created by AlonH on 04/05/2017.
 */
public class ValidateScannerInputMain {

    public enum Names {Iddan, Moshik, Barak}

    public boolean verifyInput(Names name) {

        switch (name) {
            case Iddan:
            case Moshik:
            case Barak:
                return true;
            default:
                return false;
        }
    }
}
