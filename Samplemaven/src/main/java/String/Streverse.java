package String;

public class Streverse 
{

	public static void main(String[] args) 
	{
		String s="MALAYALAM";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		if(s.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
