public class Student12{

String name;
int Rollno;
int Marks;

public Student12(String name,int Rollno,int Marks)
{
 this.name=name;
 this.Rollno=Rollno;
 this.Marks=Marks;
}
public void Display()
{
System.out.println("Name: "+name+" Roll No: "+Rollno+" Marks: "+Marks);
}

public static void main(String[] args)
{ 
  Student12  s=new Student12("Nilesh",32,98);
 s.Display();
}
}
