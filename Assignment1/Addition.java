import java.util.Scanner;
public class Addition{
public static void main(String[] rags)
{
	Scanner Sc=new Scanner(System.in);
	System.out.print("Enter the first number:");
        int num1=Sc.nextInt();
	System.out.print("Enter the Second number:");
	int num2=Sc.nextInt();
	int sum=num1+num2;
	System.out.println("The su of the given number is:"+sum);
}
}