
public class EntranceRoom extends Room
{
	public EntranceRoom(boolean north, boolean south, boolean east, boolean west)
	{
		super(null, north, south, east, west);
		
		this.healingPotionCount = 0;
		this.visionPotionCount = 0;
		this.pit = 0;
		this.exit = 0;
		this.entrance = 1;
		this.monsterChance = 0;
		this.monsterCount = 0;
		
	}//end EntranceRoom
	
	public String roomStats()
	{
		return "This is the Entrance...";
		
	}//end roomStats

}//end class
