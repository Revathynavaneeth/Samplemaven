package inheritance;

public class Developer extends Employee
{
	String d="Developer";
public void dis()
{
	System.out.println("Employee is "+d);
}
	public static void main(String[] args) 
	{
		Developer ob1=new Developer();
		ob1.dis();
		ob1.disp();
	

	}

}
