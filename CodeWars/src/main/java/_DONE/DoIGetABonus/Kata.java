package _DONE.DoIGetABonus;

public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    String finalSalary= new String ("£");
    int salaryAfterBonus = salary;
    if (bonus){
      salaryAfterBonus = salary *10;
    }
    finalSalary = finalSalary + salaryAfterBonus;
    return finalSalary;
  }
}	