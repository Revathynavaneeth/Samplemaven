package Superkeyword;

public class Child extends Parent
{
int a=50;
public void display()
{
	
	super.display();
	super.show();
	System.out.println("Child class method" +super.a);
	System.out.println(a);
}
public Child()
{
	super();
	System.out.println("Child constructor");
}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
	}

}
