public class Student13
{
public Student13()
{
this(10,20);
System.out.println("After calling parameterize constructor");
}
public Student13(int a,int b)
{
int c=a+b;
System.out.println("SUM: "+c);
}
public static void main(String[] args)
{ 
  Student13  s=new Student13();
}
}
