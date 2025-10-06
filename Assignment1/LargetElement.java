import java.util.Scanner;
public class LargetElement{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
int num1;
System.out.println("Enter the Number First:");
num1=Sc.nextInt();
int num2;
System.out.println("Enter the number second:");
num2=Sc.nextInt();
int num3;
System.out.println("Enter the number Three:");
num3=Sc.nextInt();
if(num1>num2 && num1>num3)
{
System.out.println("The Largest number among the three number is:"+num1);
}
else if(num2>num1 && num2>num3)
{
System.out.println("The Largest number among the three number is:"+num2);
}
else{
System.out.println("The Largest number among the three number is:"+num3);
}
}
}
