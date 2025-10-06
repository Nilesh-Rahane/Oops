abstract class Animal{
public abstract void voice();
public void eat()
{
	System.out.println("Animal is Eating..");
}
}
class Dog extends Animal{

public void voice()
{
	System.out.println("Dog Voice");
}
public static void main(String args[])
{
	Dog D=new Dog();
	D.eat();
        D.voice();
}

}