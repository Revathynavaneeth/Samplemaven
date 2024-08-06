package Aggregatiom;

public class Student 
{
String name;
int rno;
int std;
Address add;
public Student(String name,int rno,int std,Address add)
{
	this.name=name;
	this.rno=rno;
	this.std=std;
	this.add=add;
	}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("Roll No." + rno);
	System.out.println("Standard:"+std);
	System.out.println("House number:"+ add.hno);
	System.out.println("Street:"+add.street);
	System.out.println("City:"+add.city);
	System.out.println("State:"+add.state);
}
public static void main (String args[])
{
	Address obj= new Address(28,"Padayani","TVM","Kerala");
	Student ob= new Student("Dhrupad",21,3,obj);
	ob.display();
}
}
