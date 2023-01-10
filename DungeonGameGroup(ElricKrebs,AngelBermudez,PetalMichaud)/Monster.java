public abstract class Monster extends GameCharacter //implements Ability
{
	private double chanceToHeal;
	private int minHeal, maxHeal;

	public Monster(Ability[] flyweightRef, String name, int hitPoints, int attackSpeed,
				     double chanceToHit, double chanceToHeal,
					 int damageMin, int damageMax,
					 int minHeal, int maxHeal)
	{
		super(flyweightRef, name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		this.chanceToHeal = chanceToHeal;
		this.maxHeal = maxHeal;
		this.minHeal = minHeal;
		this.setAbility(flyweightRef[2]);

	}//end Monster
	
	public double getChanceToHeal()
	{
		return chanceToHeal;
		
	}//end getChanceToHeal

	public void setChanceToHeal(double chanceToHeal) 
	{
		this.chanceToHeal = chanceToHeal;
		
	}//end setChanceToHeal

	public int getMinHeal()
	{
		return minHeal;
		
	}//end getMinHeal

	public void setMinHeal(int minHeal)
	{
		this.minHeal = minHeal;
		
	}//end setMinHeal

	public int getMaxHeal()
	{
		return maxHeal;
		
	}//end getMaxHeal

	public void setMaxHeal(int maxHeal)
	{
		this.maxHeal = maxHeal;
		
	}//end setMaxHeal
	
	public void specialAttack(GameCharacter thisMonster)
	{
		if(this.isAlive())
		{
			System.out.print(this.getName());
			this.getAbility().doAbility((Monster)thisMonster);
		}
		
	}//end specialAttack
	  
	public void subtractHitPoints(int hitPoints)
	{
		super.subtractHitPoints(hitPoints);
		specialAttack(this);
	
	}//end subtractHitPoints

}//end Monster class