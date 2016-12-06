import java.util.ArrayList;
import java.util.Random;
/**
 * The Army class builds an army of size (passed to the constructor of random humans, elves, cyberdemons, and balrogs.  It contians methods to get
 * the whole army, a single soldier (acording to index) and a getter for the army size
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class Army
{
    private ArrayList<Creature> army = new ArrayList<Creature>();
    private Random rand = new Random();
    private int armySize;

    /**
     * Constructor of army class, creates a random army of humans, elves, and demons
     * @param size  creates a randomly generated army of size size
     */
    public Army(int size)
    {
        armySize = size;
        int randomInt;
        for(int soldier = 0; soldier < size; soldier++)
        {
            randomInt = rand.nextInt(10);
            if(randomInt < 6)
            {
                army.add(new Human());
            }
            else if (randomInt > 5 && randomInt < 8)
            {
                army.add(new Elf());
            }
            else if (randomInt == 8)
            {
                army.add(new CyberDemon());
            }
            else
            {
                army.add(new Balrog());
            }
        }
    }

    /**
     * returns the arraylist of this object containing the soldiers in this army
     * @retrn returns the arrayList of soldiers in this army
     */
    public ArrayList retrieveArmy()
    {
        return army;
    }
    
    /**
     * returns the soldier in the array list at the specified index
     * @param index     indicates the position in the arrayList for which creature to return
     * @returns        returns the creature in the arrayList at index index
     */
    public Creature returnSoldier(int index)
    {
        return army.get(index);
    }
    
    /**
     * returns the number of creatures in this army object
     * @return returns the number of creature objects in the arrayList
     */
    public int getSize()
    {
        return armySize;
    }
    
}
