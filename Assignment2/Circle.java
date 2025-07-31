import java.util.*;
class Area{
 public static  double  circle_area(double radius)
{
 return 3.14*radius*radius;
}
}
public class Circle{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
Area obj=new Area();
double radius;
System.out.println("Enter the radius of the Circle:");
radius=Sc.nextDouble();
double ans=obj.circle_area(radius);
System.out.println("The Area of the Circle is:"+ans);
}
}
