import java.util.*;
class Factorial1{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the value of NUM:");
int num=Sc.nextInt();
int fact=1;
for(int i=num;i>1;i--)
{
fact=fact*i;
}
System.out.println("The Factorial of The Given number is:"+fact);
}
}