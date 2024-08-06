package inheritance;

public class Totalsal extends Deductions
{
	int total;
public void show()
{
	this.total=(bp+hra+bonus)-ded;
	System.out.println("Basic pay:"+ bp);
	System.out.println("HRA:"+ hra);
	System.out.println("Deductions" +ded);
	System.out.println("PF: =" +pf);
	System.out.println("BOnus:" +bonus);
	
	
	
}
public static void main (String args[])
{
	Totalsal obj =new Totalsal();
	obj.show();
	Employeee ob= new Employeee(20000,5000,2000);
	Deductions ob1= new Deductions();
    ob1.display();
    
    
	
}
}
