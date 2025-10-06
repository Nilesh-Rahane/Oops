class Animal{
public void voice()
{
System.out.println("Animal Voice");
}
}
public class Elephant extends Animal{
public void voice()
{
super.voice();
System.out.println("Elephant voice");
}
public static void main(String args[])
{
	Elephant E=new Elephant();
	E.voice();
} 
}