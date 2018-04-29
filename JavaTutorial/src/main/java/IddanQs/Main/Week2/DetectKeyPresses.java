package IddanQs.Main.Week2;

/**
 * Created by AlonH on 30/04/2017.
 */
public class DetectKeyPresses {

/*    public void detectKey(int key) {

        switch (key) {
            case 0:
                System.out.println("the key pressed is: " + key);
                break;
            case 1:
                System.out.println("the key pressed is: " + key);
                break;
            case 2:
                System.out.println("the key pressed is: " + key);
                break;
            case 3:
                System.out.println("the key pressed is: " + key);
                break;
            case 4:
                System.out.println("the key pressed is: " + key);
                break;
            case 5:
                System.out.println("the key pressed is: " + key);
                break;
            case 6:
                System.out.println("the key pressed is: " + key);
                break;
            case 7:
                System.out.println("the key pressed is: " + key);
                break;
            case 8:
                System.out.println("the key pressed is: " + key);
                break;
            case 9:
                System.out.println("the key pressed is: " + key);
                break;
             default:
                System.out.println("the key pressed is not valid");
                break;


        }
    }*/

    public boolean detectKey(int key) {

        if(key >= 0 && key <= 9)
            return true;
        return false;
    }
}
