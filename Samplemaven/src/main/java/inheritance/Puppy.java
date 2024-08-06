package inheritance;

public class Puppy extends Dog
{
	String p="dob puppy";
	public void bark()
	{
		System.out.println("Puppy is"+p);
		
	}
	

	public static void main(String[] args)
	{
	Puppy obj=new Puppy();
	
	obj.bark();
	obj.show();
	obj.display();
	System.out.println(obj.p);
			

	}

}
