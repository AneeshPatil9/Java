import java.util.*;
interface client
{
	void input();
	void output();
}
public class grahakinterface implements client
{	
	String name;
	double salary;
	public void input()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name");
	name=sc.nextLine();
   	System.out.println("Enter your salary");
	salary=sc.nextDouble();
   	}
	public void output()
	{
	System.out.println("Grahak name is="+name);
	System.out.println("Grahak rokda is="+salary);
	}
	public static void main(String[] args)
	{
	client c=new grahakinterface();
	c.input();
	c.output();
       
	}
} 
