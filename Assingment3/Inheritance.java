 public class Inheritance{
 public static void main(String[] args){


 Dog d = new Dog();
d.eat();
 d.bark();
 d.eat();
}
}

 class Animal{

   public Animal(){
    System.out.println("Animal constructor");
  }

  void eat(){
 System.out.println("Animal can eat");
}
}

 class Dog extends Animal{

   public Dog(){
    System.out.println("Dog constructor");
  }

  void bark(){
 System.out.println("Dog can bark");
}
}