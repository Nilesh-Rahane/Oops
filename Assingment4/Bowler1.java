abstract class Player{
public abstract void fitness();

public void game()
{
	System.out.println("Playing Cricket Game");
}
}
class Bowler1 extends Player{
public void fitness()
{
	System.out.println("Bowling Fitness");
}
}
class Batter extends Bowler1{
public void fitness()
{
	System.out.println("Batter Fitness");
}
}
class Allrounder extends Batter{
public void fitness()
{
	System.out.println("Allrounder Fitness");
}

public static void main(String args[])
{
	Bowler1 B=new Bowler1();
	B.game();
	B.fitness();	
}
}
