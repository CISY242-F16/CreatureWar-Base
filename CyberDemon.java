
/**
 * the CyberDemon Class is a subclass of the Demon Class with hp from 25 to 100 and strength from
 * 20 to 40
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class CyberDemon extends Demon
{
    /**
     * Constructor for objects of class CyberDemon that creates a random number between 20 and 40
     * and stores it to strength field, and sets the hp field to a random number between 25 and 100
     */
    public CyberDemon()
    {
       super();
       strength = (rand.nextInt(21) + 20);
       hp = (25 + rand.nextInt(76));
    }

}
