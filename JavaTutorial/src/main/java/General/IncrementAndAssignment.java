package General;

public class IncrementAndAssignment {

	public static void main(String[] args)
	{
		int x=10;
		x = x +1;
		System.out.println("x+1 is: "+x);//11
		
		x=10;
		x++;
		System.out.println("x++ is: "+x);//11
		
		x=10;
		System.out.println("x++ is: "+x++);//10
		System.out.println(x); //11
		
		x=10;
		System.out.println(++x);//11
		System.out.println(x); //11

		x=10;
		x+=5; //x=x+5
		System.out.println(x); //15

		
	}

}
