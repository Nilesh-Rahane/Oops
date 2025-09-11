public class TestException{
public static void main(String args[])
{
int a=20;
int b=0;
int sum=a+b;
if(b==0)
{
	throw new ArithmeticException("We can not divide the number by Zero");
}else{
	int c=a/b;
	System.out.println("Division is: "+c);
}
System.out.println("Addition is: "+sum);
}
}