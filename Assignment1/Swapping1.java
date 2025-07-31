import java.util.Scanner;
public class Swapping1{
public static void main(String[] args)
{
 Scanner Sc=new Scanner(System.in);
 System.out.println("Enter the value of A:");
 int a=Sc.nextInt();
 System.out.println("Enter the value of B:");
 int b=Sc.nextInt();
 int temp=a;
 a=b;
 b=temp;
 System.out.println("A:"+a);
 System.out.println("B:"+b);	
}
}