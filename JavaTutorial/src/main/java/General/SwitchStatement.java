package General;

public class SwitchStatement
{

	public static void main(String[] args)
	{
		int score = 50;
		// byte, short, int, char
		switch (score)
		{
		case 0:
			System.out.println("score is \"0\"");
			break; //must have a BREAK command to end the switch case
		case 50:
			System.out.println("score is \"50\"");
			break;
		case 90:
			System.out.println("score is \"90\"");
			break;

		default:
			System.out.println("score is not defined");
			break;
		}
		
		
		
		
		
	}

}
