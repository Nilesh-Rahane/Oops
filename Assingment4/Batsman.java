class Player{
public Player(String game)
{
System.out.println("In Player Constructor "+game);
}
}
public class Batsman extends Player{ 
 public Batsman()
{
super("Nilesh");
System.out.println("In batsman Constructor");
}
public static void main(String args[])
{
	Batsman B=new Batsman();
}
}