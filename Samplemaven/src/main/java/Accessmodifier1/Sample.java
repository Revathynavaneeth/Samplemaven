package Accessmodifier1;

public class Sample 
{
	protected int a=1;
	protected void display()
	{
	System.out.println(a);

	}

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.display();
	}

}
