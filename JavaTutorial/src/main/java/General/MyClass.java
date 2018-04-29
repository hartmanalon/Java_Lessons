package General;

public class MyClass
{

	public static void main(String[] args)
	{
		
		Student mark = new Student(); //mark is an object/instance
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(32);
		System.out.println(mark.getName() + " is " + mark.getAge() + " years old");
		Student tom = new Student(2, "Tom", 30);
		System.out.println();
		Cube cube2 = new Cube(2,3,4);
		System.out.println("height of cube2 is: " + cube2.getCubeVolume(2, 3, 4));
		Student.noOfStudents = 1; //static access to the noOfStudents int in the Student class not in an instance
		//-------------------------------------------------------------------------
		
		
		
		
		
		
		
	}

}
