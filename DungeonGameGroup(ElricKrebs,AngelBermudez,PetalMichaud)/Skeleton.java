public class Skeleton extends Monster
{
    public Skeleton(Ability[] flyweightRef)
	{
		super(flyweightRef, "Sargath the Skeleton", 100, 3, .8, .3, 30, 50, 30, 50);

    }//end Skeleton

	public void attack(GameCharacter opponent)
	{
		System.out.println(super.getName() + " slices his rusty blade at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end attack

}//end class