class Employee1
{
 int Emp_id;
 String name;
public Employee1(int id , String n)
{
Emp_id=id;
name=n;
System.out.println("Employee Id:"+Emp_id);
System.out.println("Employee Name:"+name);
}
public  Employee1(Employee1 obj)
{
Emp_id=obj.Emp_id;
name=obj.name;
System.out.println("Employee Id:"+Emp_id);
System.out.println("Employee name:"+name);
}
}

public class Information2{
public static void main(String[] args)
{
Employee1 obj=new Employee1(32,"Nilesh Rahane");
Employee1 obj1=new Employee1(obj);
}
}
