import java.util.*;
public class TestFinally{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Emter the first Number: ");
int num1=Sc.nextInt();
System.out.println("Enter the Second Number : ");
int num2=Sc.nextInt();
try{
int Div=num1/num2;
System.out.println("Division is: "+Div);
}
catch(Exception e)
{
System.out.println("We can not divided number by Zero");
}
{
System.out.println("Input Number "+num1 +" " +num2);
}
System.out.println("Input Number "+num1 +" " +num2);
}
}