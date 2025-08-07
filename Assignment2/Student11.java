public class Student11{

String name;
int Rollno;
int Marks;

public Student11(String name,int RollNo,int Marks)
{
 name=name;
 Rollno=Rollno;
 Marks=Marks;
}
public void Display()
{
System.out.println("Name: "+name+" Roll No: "+Rollno+" Marks: "+Marks);
}

public static void main(String[] args)
{ 
  Student11  s=new Student11("Nilesh",32,98);
 s.Display();
}
}
