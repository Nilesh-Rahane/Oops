interface Animal{
public void voice();
}
class Cat implements Animal{
public void voice()
{
	System.out.println("In Cat Voice");
}
public static void main(String args[])
{
Cat c=new Cat();
c.voice();
}
}