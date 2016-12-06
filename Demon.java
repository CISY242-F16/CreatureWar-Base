
/**
 * Demon class is a sub class of Creature class.  Demon objects have the same hp and strenght as a 
 * Creature object, but have an overridden damage method that has a 5% chace of adding +50 to damage
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class Demon extends Creature
{
   /**
     * Constructor for objects of class Demon that inititates the strenght and hp fields as random
     * numbers between 1 and 10
     */
    public Demon()
    {
      super(true, 10, 10);
    }

   /**
    * Overridden damage method that returns a damage value of 1 to strenght field and gives a 5% chance of adding +50 to damage
    * @return a random damage number from 1 to Demon's strength + 50
    */
    public int damage()
    {
        int dam = super.damage();
        int randInt = rand.nextInt(20);
        return randInt == 0 ? (dam + 50) : dam;
    }
}
