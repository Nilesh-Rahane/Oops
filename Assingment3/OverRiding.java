class Animal {

   void eat(){
  System.out.print("In animal class");
}
}

class Dog extends Animal{
  void eat(){
  System.out.print("In Dog class");
}

   
}

public class OverRiding{

public static void main(String args[]){
 
Dog d1 = new Dog();

d1.eat();

}

}