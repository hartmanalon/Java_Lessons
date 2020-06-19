package _DONE.BasicSubclasses_AdamAndEve;

public class God {
    public static Human[] create(){
        Human[] humans = new Human[2];
        humans[0] = new Man();
        humans[1] = new Woman();
        return humans;
    }
}
