class Employee{
Employee()
{
System.out.println("Employee salary is 30000");
}
}
public class Maneger extends Employee{
 Maneger()
{
System.out.println("Maneger salary is 80000");
}
public static void main(String args[])
{
	Maneger M=new Maneger();
}
}