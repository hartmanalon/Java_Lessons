package General;

public class Student
{
/*Access levels
 * Modifier		Class		Package		SubClass		World
 * public		  Y				Y			Y			  Y
 * protected	  Y				Y			Y			  N
 * no modifier	  Y				Y			N			  N
 * private		  Y				N			N			  N
 */
	
	private int id;
	private String name;
	private int age;
	static int noOfStudents = 0;
	
	//Constructors
	Student ()
	{
		System.out.println("This is a default constructor...");
	}
	
	Student (int i, String n, int a)
	{
		id = i;
		name = n;
		age = a;
		System.out.println(name + " is " + age + " years old");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId()
	{ return id; }

	public void setId(int id)
	{ this.id = id; }
	
	public String getName()
	{ return name; }
	
	public void setName(String name)
	{ this.name = name; }
	
	public int getAge()
	{ return age; }
	
	public void setAge(int age)
	{ this.age = age; }
	
	
	
	
	
	
	
}
