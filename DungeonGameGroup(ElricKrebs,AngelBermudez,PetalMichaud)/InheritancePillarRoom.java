
public class InheritancePillarRoom extends Room
{
	public InheritancePillarRoom(MonsterFactory monsterFactory, boolean north, boolean south, boolean east,
			boolean west)
	{
		super(monsterFactory, north, south, east, west);
		super.iPillar = true;
	}//end InheritancePillarRoom
	
}//end class
