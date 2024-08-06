package Test;

public class Myname 
{
public String display(String name)
{
	return name;
}

	public static void main(String[] args)
{
	Myname obj=new Myname();
	String s=obj.display("Revathy");
	System.out.println(s);
	}
}
