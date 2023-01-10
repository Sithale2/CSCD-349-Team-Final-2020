
public abstract class GameCharacter
{
	private Ability[] flyweightReference;
	public Ability[] getFlyweightReference()
	{
		return flyweightReference;
	}//end getFlyweightReference

	private Ability regularAttack;
	protected Ability ability; //Maybe make this private later?
	private String name;
	private int hitPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int damageMin, damageMax;

	public GameCharacter(Ability[] flyweightRef, String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax)
	{
		this.flyweightReference = flyweightRef;
	
		this.regularAttack = flyweightReference[1];
		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;

	}//end GameCharacter
	
	public void setFlyweightReference(Ability[] flyweightReference)
	{
		this.flyweightReference = flyweightReference;
		
	}//end setFlyweightReference

	public Ability getRegularAttack()
	{
		return regularAttack;
		
	}//end getRegularAttack

	public void setRegularAttack(Ability regularAttack)
	{
		this.regularAttack = regularAttack;
		
	}//end setRegularAttack

	public Ability getAbility()
	{
		return ability;
		
	}//end getAbility

	public void setAbility(Ability ability)
	{
		this.ability = ability;
		
	}//end setAbility

	public void setName(String name)
	{
		this.name = name;
		
	}//end setName

	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
		
	}//end setHitPoints

	public void setAttackSpeed(int attackSpeed)
	{
		this.attackSpeed = attackSpeed;
		
	}//end setAttackSpeed

	public void setChanceToHit(double chanceToHit)
	{
		this.chanceToHit = chanceToHit;
		
	}//end setChangeToHit

	public void setDamageMin(int damageMin)
	{
		this.damageMin = damageMin;
		
	}//end setDamageMin

	public void setDamageMax(int damageMax)
	{
		this.damageMax = damageMax;
		
	}//end setDamageMax
	
	
	public String getName()
	{
		return this.name;
		
	}//end getName

	public int getHitPoints()
	{
		return this.hitPoints;
		
	}//end getHitPoints
	
	public int getAttackSpeed()
	{
		return this.attackSpeed;
		
	}//end getAttackSpeed
	
	public double getChanceToHit()
	{
		return this.chanceToHit;
		
	}//end getChanceToHit
	
	public int getDamageMin()
	{
		return this.damageMin;
		
	}//end getDamageMin
	
	public int getDamageMax()
	{
		return this.damageMax;
		
	}//end getDamageMax

	public void addHitPoints(int hitPoints)
	{
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else
		{
			this.hitPoints += hitPoints;

		}
		
	}//end addHitPoints

	public void subtractHitPoints(int hitPoints)
	{
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		
		else if (hitPoints >0)
		{
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " hit " +
								" for <" + hitPoints + "> points damage.");
			System.out.println(getName() + " now has " +
								getHitPoints() + " hit points remaining.");
			System.out.println();
		}

		if (this.hitPoints == 0)
			System.out.println(name + " has been killed :-(");

	}//end subtractHitPoints

    public boolean isAlive()
	{
	  return (hitPoints > 0);
	  
	}//end isAlive

    public void attack(GameCharacter opponent)
    {
		boolean canAttack;
		int damage;
		canAttack = Math.random() <= chanceToHit;
		
		if (canAttack)
		{
			damage = (int)(Math.random() * (damageMax - damageMin + 1)) + damageMin ;
			opponent.subtractHitPoints(damage);
			System.out.println();
		}
		
		else
		{
			System.out.println(getName() + "'s attack on " + opponent.getName() + " failed!");
			System.out.println();
		}

	}//end attack
    
    public String getAbilityName()
    {
    	return ability.getDisplay();
    	
    }//end getAbilityName
    
    public abstract void specialAttack(GameCharacter opponent);
    
}//end class
