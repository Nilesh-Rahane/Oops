class Player{
public Player(String name)
{
System.out.println("In Player Constructor: "+name);
}
}
public class Allrounder extends Player{ 
 public Allrounder(String name)
{
super("sanjivani");

System.out.println("In Bowler Constructor: "+name);
}
public static void main(String args[])
{
	Allrounder A=new Allrounder("Jasprit");
}
}