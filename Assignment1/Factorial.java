import java.util.*;
class Factorial{
	public int fact(int n)
{
	if(n==1) return 1;
	int ans=n*fact(n-1);
        return ans;
}
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the value of NUM:");
int num=Sc.nextInt();
Factorial obj=new Factorial();
int result=obj.fact(num);
System.out.println("The factorial of the Given number is:"+result);
}
}