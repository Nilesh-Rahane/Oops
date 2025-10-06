class Employee
{
 int salary,id;
 String name;
 public Employee()
{
id=200;
name="Nilesh Rahane";
salary=20000;
}

public void display()
{
System.out.println("Employee Information:");
System.out.println("Employee id:"+id);
System.out.println("Employee Name:"+name);
System.out.println("Employee salary:"+salary);
}
}

public class Information1{
public static void main(String[] args)
{
Employee obj=new Employee();
obj.display();
}
}
