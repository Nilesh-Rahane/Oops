class Employee1
{
 int salary,id;
 String name;
public Employee1()
{
id=200;
name="Nilesh Rahane";
salary=20000;
}
}
public class Employee{
public static void main(String[] args)
{
Employee1 obj=new Employee1();
System.out.println("Employee Information:");
System.out.println("Employee id:"+obj.id);
System.out.println("Employee Name:"+obj.name);
System.out.println("Employee salary:"+obj.salary);
}
}
