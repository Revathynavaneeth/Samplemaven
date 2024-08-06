package Aggregatiom;

public class Book 
{
String bname;
int year;
String type;
Author auth;
public Book(String bname,int year,String type,Author auth)
{
	this.bname=bname;
	this.year=year;
	this.type=type;
	this.auth=auth;
	
}
public void display()
{
	System.out.println("Book Name:" + bname);
	System.out.println("Year:" +year);
	System.out.println("Type:" + type);
	System.out.println("Author:" +auth.name);
	System.out.println("Award:" + auth.award);
	System.out.println("Residence:" +auth.res);

}
public static void main (String args[])
{
	Author obj=new Author("Arundathi Roy","Booker Prize","Mumbai");
	Book ob=new Book("The god of small things",1997, "Novel", obj);
	ob.display();
	
}
}
