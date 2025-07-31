import java.util.Scanner;
public class Division{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the first Number:");
int num_1=Sc.nextInt();
System.out.println("Enter the Second number:");
int num_2=Sc.nextInt();

int div=num_1/num_2;

System.out.println("The Division of the Given Number is:"+div);
}
}
