package Test;
import java.util.Scanner;
// String reverse test
public class Test2 
{

	public static void main(String[] args)
	{
	String reverse="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to be reversed");
	String s=sc.next();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		reverse=ch+reverse;
		
	}
	System.out.println("The reverse of the string is"+ reverse);
	}

}
