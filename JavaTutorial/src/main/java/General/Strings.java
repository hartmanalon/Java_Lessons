package General;

public class Strings
{

	public static void main(String[] args)
	{
		String name = "Alon Hartman";
		System.out.println("string length is: " +name.length());
		
		String nameInLowerCase = name.toLowerCase();
		System.out.println(nameInLowerCase);
		
		String nameInUpperCase = name.toUpperCase();
		System.out.println(nameInUpperCase);
		
		name = name + "!";
		System.out.println(name);
		
		System.out.println(name.replace("Alon", "Moran"));

	}

}
