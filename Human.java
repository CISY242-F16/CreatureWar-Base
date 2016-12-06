
/**
 * Human class is a subclass of the creature class with strenght between 5 and 18 and hp between 10 and 30.
 * 
 * @author Dana Sabatino 
 * @version 2016.12.05
 */
public class Human extends Creature
{

    /**
     * Constructor for objects of Human subclass, inititates strength field to a rondom number between 5 and 18, and the hp field to a random number between 10 and 30.
     */
    public Human()
    {
        super();
        strength = (rand.nextInt(14) + 5);
        hp = (rand.nextInt(21) + 10);
    }

}
