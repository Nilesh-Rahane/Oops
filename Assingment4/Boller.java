abstract class Player{
public abstract void fitness();

public void game()
{
	System.out.println("Playing Cricket Game");
}
}
class Boller extends Player{
public void fitness()
{
	System.out.println("Bowling Fitness");
}
public static void main(String args[])
{
	Player A=new Boller();
	A.game();
	A.fitness();	
}
}
