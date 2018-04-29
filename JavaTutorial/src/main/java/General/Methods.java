package General;

import java.util.Scanner;

public class Methods
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		print();
		print("Print Me...");
		System.out.println("Please enter a number: ");
		a = scan.nextInt();
		System.out.println("Please enter another number: ");
		b = scan.nextInt();
		
		System.out.println(calcAdd(a,b));
		System.out.println(calcSub(a,b));
		System.out.println(calcMult(a,b));
		System.out.println(calcDiv(a,b));
		System.out.println(calcPower(a,b));
		scan.close();
		
	}
	
	
	//Methods	
	public static void print(String a)
	{
		System.out.println(a);
	}

	public static void print()
	{
		System.out.println("Hello Youtube");
	}

	private static int calcAdd(int a, int b)
	{ return a+b; }

	private static int calcSub(int a, int b)
	{ return a-b; }

	private static int calcMult(int a, int b)
	{ return a*b; }

	private static int calcDiv(int a, int b)
	{ return a/b; }

	private static int calcPower(int a, int b)
	{ return (int) Math.pow(a,b); }


	

	
	
	
	
	
	
	
}
