package General;

public class DoWhileStatement
{

	public static void main(String[] args)
	{
		int a = 0;
		
		while (a < 10)
		{
			System.out.println("while loop - \"a\" is: "+a);
			a++;
		}

		System.out.println("-----------------------------");
		
		do
		{
			System.out.println("do-while loop - \"a\" is: "+a);
			a--;
		}
		while (a > 0);
		
		
		
		
		
	}

}
