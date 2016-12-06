
/**
 * The Elf class is a subclass of the creature class.  An Elf object has strength between 5 and 18
 * and hp between 8 and 25.  The Elf class has its own overriden damage function that has a 10% 
 * chance of doing 2x damage
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    /**
     * Constructor for objects of class Elf that sets strenght at a value from 5 through 18 and hp at a value from 8 through 25
     */
    public Elf()
    {
        super();
        strength = (5 + rand.nextInt(14));
        hp = (8 + rand.nextInt(18));
    }

  /**
   * Overriden damage method to include a 10% chance of doing 2x damage, which is a random number
   * between 1 and strength
   * @return the random damage from a elf object ranging from 1 to 2*Creature's strength
   */
    public int damage()
    {
        int dam = super.damage();
        int randInt = rand.nextInt(10);
        return randInt == 0 ? (dam*2) : dam;
    }
}
