public class NullException{
public static void main(String args[])
{
String str="Nilesh";
System.out.println("The length Of The String is: "+str.length());
try{
String str2=null;
System.out.println("The length of the given String is: "+str2.length());
}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
String str1="";
System.out.println("The length of the given String is: "+str1.length());
}
}