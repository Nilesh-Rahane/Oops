public class TestDivision1{
public static void main(String args[])
{
int num1=10;
int num2=0;
int sum=num1+num2;
System.out.println("SUM is: "+sum);
try{
int div=num1/num2;
System.out.println("Division is:"+div);
}
catch(Exception e)
{
System.out.println("We con divide by zero: "+e);
}
int sub=num1-num2;
System.out.println("Substraction is :"+sub);
}
}