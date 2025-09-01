class Player{
public Player()
{
System.out.println("In Player Constructor ");
}
}
public class Bowler extends Player{ 
 public Bowler(String name)
{
System.out.println("In Bowler Constructor: "+name);
}
public static void main(String args[])
{
	Bowler B=new Bowler("Jasprit");
}
}