
public class RegularRoom extends Room
{
	public RegularRoom(MonsterFactory monsterFactory, boolean north, boolean south, boolean east, boolean west)
	{
		super(monsterFactory, north, south, east, west);
		this.monsterChance = .3;
		
		double randomNum = Math.random();
		
		if(randomNum < 0) 
			randomNum *= -1;
		
		if(this.monsterChance > randomNum)
		{
			this.monsterCount = 1;
			this.monsterC = this.generateMonster();
		}
		
	}//end RegularRoom
	
}//end class
