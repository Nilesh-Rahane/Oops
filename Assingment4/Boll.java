abstract class Player{
public abstract void fitness();

public void game()
{
	System.out.println("Playing Cricket Game");
}
}
class Boll extends Player{
public void fitness()
{
	System.out.println("Bowling Fitness");
}
public static void main(String args[])
{
	Boll B=new Boll();
	B.game();
	B.fitness();	
}
}
