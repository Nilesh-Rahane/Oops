import java.util.Scanner;
public class Array{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the Size of Array:");	
int size=Sc.nextInt();
int Arr[]=new int[size];
System.out.println("Enter the Element of the Array:");
for(int i=0;i<size;i++)
{
Arr[i]=Sc.nextInt();
}
System.out.println("Your Array is:");
for(int i=0;i<size;i++)
{
System.out.print(Arr[i]+" ");
}
int sumE=0;
int sumO=0;
for(int i=0;i<size;i++)
{
  if(Arr[i]%2==0)
{
sumE+=Arr[i];
}
}
for(int i=0;i<size;i++)
{
  if(Arr[i]%2!=0)
{
sumO+=Arr[i];
}
}
System.out.println("The Sum of all Even Number in the Array is:"+sumE);
System.out.println("The Sum of all Odd Number in the Array is:"+sumO);
}
}