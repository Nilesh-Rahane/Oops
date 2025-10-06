interface Father{
public void property();
}
interface Mother{
public void property();
}
class Child implements Father,Mother{
public void property()
{
System.out.println("In Child Property");
}
}
class GreandChild1 extends Child
{
}
class GreandChild2 extends Child
{
}
public class HybridInheritance{
public static void main(String args[])
{
Child c=new Child();
c.property();
GreandChild1 G1=new GreandChild1();
G1.property();
GreandChild2 G2=new GreandChild2();
G2.property();
}
}