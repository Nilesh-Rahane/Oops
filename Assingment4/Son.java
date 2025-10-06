interface Father
{
public void bringWater();
}
interface Mother {
public void bringWater();
}
public class Son implements Father,Mother
{
public void bringWater()
{
	System.out.println("brought water for both father and mother");
}
public static void main(String args[])
{
Father F=new Son();
F.bringWater();
Mother M=new Son();
M.bringWater();
Son s=new Son();
s.bringWater();
}
}
