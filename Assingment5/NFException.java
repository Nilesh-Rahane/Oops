public class NFException{
public static void main(String args[])
{
try{
String str="Nilesh";
int b=Integer.parseInt(str);
System.out.println("Number :"+b);
}
catch(Exception e)
{
System.out.println("String ans Charactor can be converted in to Integer");
}
String n="10";
int a=Integer.parseInt(n);
System.out.println("Number :"+a);
}
}