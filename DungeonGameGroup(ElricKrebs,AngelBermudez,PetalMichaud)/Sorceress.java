public class Sorceress extends Hero
{
    public Sorceress(Ability[] flyweightRef)
	{
		super(flyweightRef, "Sorceress", 75, 5, .7, 25, 50, .3);
		this.setAbility(flyweightRef[2]);
		
    }//end Sorceress

}//end class