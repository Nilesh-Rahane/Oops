import java.util.*;
public class Area{
 public static  double  tringle_area(double base, double height)
{
 return 0.5*base*height;
}
}
public class Tringle{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
Area obj=new Area();
double base;
System.out.println("Enter the base of the Tringle:");
base=Sc.nextDouble();
double height;
System.out.println("Enter the height of the Tringle:");
height=Sc.nextDouble();
double ans=obj.tringle_area(base, height);
System.out.println("The Area of the Tringle is:"+ans);
}
}
