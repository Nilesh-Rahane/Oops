
class Animal {

  void eat(){
  System.out.println("In animal class");
}
}

class Dog extends Animal{
  void eat(){
  super.eat();
  System.out.println("In Dog class");
}

   
}
class Rbi{
	void roi()
{
	System.out.println("the rate of interest of Rbi bank is 8");
}
}

class Sbi extends Rbi{
	void roi()
{
	System.out.println("the rate of interest of Rbi bank is 5");
}
}
public class OverRiding{

public static void main(String args[]){
 
Dog d1 = new Dog(); 
//Sbi S=new Sbi();
//Animal A=new Animal();

d1.eat();
//S.roi();
//A.eat();
}
}