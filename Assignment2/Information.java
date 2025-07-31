import java.util.*;
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
}

public class Information{
public static void main(String[] args)
{
Employee obj=new Employee();
System.out.println("Employee Information:");
System.out.println("Employee id:"+obj.id);
System.out.println("Employee Name:"+obj.name);
System.out.println("Employee salary:"+obj.salary);
}
}
