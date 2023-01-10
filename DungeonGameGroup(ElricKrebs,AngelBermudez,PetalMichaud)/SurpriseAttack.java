
public class SurpriseAttack implements Ability
{
	GameCharacter thisChar;
	
	public String getDisplay()
	{
		return "Surprise Attack";
		
	}//end getDisplay
	
	public void doAbility(GameCharacter opponent) 
	{
		double surprise = Math.random();
		if (surprise <= thisChar.getChanceToHit())
		{
			System.out.println("Surprise attack was successful!\n" +
								thisChar.getName()+ " gets an additional turn.");
			thisChar.attack(opponent);
		}
		
		else if (surprise >= .9)
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		
		thisChar.attack(opponent);
	}//end doAbility
	
	public void setThisChar(GameCharacter thisChar)
	{
		this.thisChar = thisChar;
		
	}//end setThisChar

}//end class
