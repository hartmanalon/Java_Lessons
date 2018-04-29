package _DONE.DoIGetABonus;

public class KataOLD {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            return "£" + salary*10;
        } else {
            return "£" + salary;
        }
    }
}