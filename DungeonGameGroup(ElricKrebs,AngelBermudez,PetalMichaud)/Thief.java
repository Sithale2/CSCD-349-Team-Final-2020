public class Thief extends Hero
{
    public Thief(Ability[] flyweightRef)
	{
		super(flyweightRef, "Thief", 75, 6, .8, 20, 40, .5);
		this.setAbility(flyweightRef[3]);
		
    }//end constructor
    
}//end class