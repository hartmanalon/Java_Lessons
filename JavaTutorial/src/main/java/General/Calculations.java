package General;
import java.util.Scanner;

public class Calculations
{

	public static void main(String[] args)
	{
		int a,b,c;
		
		a=4;
		b=4;
		c=a+b;
		
		System.out.println(a+"+"+b+"="+c);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		a = scan.nextInt();
		System.out.println(a);
		
		
		scan.close();
	}

}
