import java.util.Scanner;
public class Prime{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int num=Sc.nextInt();
Boolean flag=true;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
  flag=false;
}
}
if(num==1)
{
System.out.println("Not Prime");
}
else if(flag==true)
{
System.out.println("Prime Number");
}
else{
System.out.println("Not Prime Number");
}
}
}