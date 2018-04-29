package General;

public class Cube
{
	
	int length, width, height;
	
	
	//Constructors
	Cube()
	{
		System.out.println("default cube constructor");
	}
	
	
	Cube(int l, int w, int h)
	{
		length = l;
		width = w;
		height = h;
	}
	
	
	//Methods
	public int getCubeVolume()
	{ return (length * width * height); }
	
	public int getCubeVolume(int l, int w, int h)
	{
		return (l * w * h);
	}
	
}
