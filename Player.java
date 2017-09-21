//Player class skeleton

Public abstract Player
{

	Private string Player_name;
	Private int Player_age;
	public int Player_score;

	public player(String name) 
	{
		Player_name = name;
	}

	public void setName(String name)
	{
	this.Player_name = name;
	}

	public String getName() 
	{
	return PlayerName;
	}

	public abstract void chooseImage()
	{
	}

public abstract void Victory()
	{
	public int numMoves;
	}

}

Public class Human extends Player
{
	public void chooseImage()
	{
	}

	public abstract void Victory()
	{
	public int numMoves;
	}

}

public class AI extends Player
{
	public void chooseImage()
	{}

	public abstract void Victory()
	{
	public int numMoves;
	}

}