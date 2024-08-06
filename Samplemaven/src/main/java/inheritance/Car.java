package inheritance;

public class Car extends Vehicle
{
	String g="Car is";
	public void displayy()
	{
		System.out.println("Car is" +g);
		
	}

	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.display();
		obj.displayy();
		System.out.println(obj.s);
		System.out.println(obj.g);// TODO Auto-generated method stub

	}

}
