
/**
 * Barlog class is a subclass of the demon class that has a range of hp from 80 to 200 and a range
 * of strength from 50 to 100.  The Balrog class also overrides the damage method to attack twice
 * each round ( 2x damage of damage() method from Demon class)
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class Balrog extends Demon
{
    /**
     * Constructor for objects of class Balrog, which sets the hp field to a random number between
     * 80 and 200, along with setting the strength field to a random number between 50 and 100
     */
    public Balrog()
    {
        super();
        strength = (50 + rand.nextInt(51));
        hp = (80 + rand.nextInt(121));
    }

 
    /**
     *  Overriden damage method that enables a Belrog object to attack twice per round
     *  @return 2 attacks (random damage from 1 to demon object's strength + 50) added together
     */
    public int damage()
    {
      return (super.damage() + super.damage());
    }
}
