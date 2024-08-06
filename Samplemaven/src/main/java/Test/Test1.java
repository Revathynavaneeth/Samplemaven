package Test;

public class Test1 
{
int a;
public Test1()
{
	this(10);
	System.out.println("VALUE OF");
	}
public Test1(int a)
{
	this.a=a;
	System.out.println("A is" +a);
}
	public static void main(String[] args) {
		Test1 obj =new Test1();
		
	}

}
