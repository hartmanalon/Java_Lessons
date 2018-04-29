package General;

public class Arrays
{

	public static void main(String[] args)
	{
		int[] scores = {1,2,3};
		
		System.out.println("index 0 is: " +scores[0]);
		System.out.println("index 1 is: " +scores[1]);
		System.out.println("array length is " +scores.length);
		
		int i = 0;
		do
		{
			System.out.println("index " +i+" is: " +scores[i]);
			i++;
		}
		while (i<scores.length);

	}

}
