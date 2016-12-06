
/**
 * The War class intializes two random armis of humans, elves, cyberdemons, and balrogs.  This class
 * uses the goToWar method to simulate a war between the two armies
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class War
{
    // instance variables - replace the example below with your own
    private Army army1;
    private Army army2;
    private int army1CurrrentIndex;
    private int army2CurrentIndex;
    private int victor;
    private int size;

    /**
     * Constructor for objects of class War, randomizes the two armies of size of armySize prameter.
     * Sets the counters for the current index for each army to zero, and victor integer to its null value
     * of -1
     * @param arraySize     uses paramater arraySize to created two randomized armies of size 
     *                      arraySize in preperation for a war between them
     */
    public War(int armySize)
    {
        army1 = new Army(armySize);
        army2 = new Army(armySize);
        size = armySize;
        army1CurrrentIndex = 0;
        army2CurrentIndex = 0;
        victor = -1;
    }

    /**
     * Simulates a series of battles between soldiers from the two armies until one or both of the
     * armies has no creatures left alive.  Than prints the outcome to the scren
     */
    public void goToWar()
    {
       do
       {
           Battle deathMatch = new Battle(army1.returnSoldier(army1CurrrentIndex), army2.returnSoldier(army2CurrentIndex));
           victor = deathMatch.doBattle();
           if (victor == 0)
           {
               army1CurrrentIndex++;
               army2CurrentIndex++;
           }
            else if (victor == 1)
           {
               army1CurrrentIndex++;
           }
           else if (victor == 2)
           {
               army2CurrentIndex++;
           }
        }while(army1CurrrentIndex < size && army2CurrentIndex < size);
        if(army1CurrrentIndex > (size - 1) && army2CurrentIndex > (size - 1))
        {
            System.out.println("All the brave soldiers of both armies fell in battle");
        }
        else if (army1CurrrentIndex > (size - 1) && army2CurrentIndex < size)
        {
            System.out.println("The soldiers of army 1 have been defeated");
        }
        else if (army1CurrrentIndex < size && army2CurrentIndex > (size - 1))
        {
            System.out.println("The soldiers of army 2 have been defeated");
        }
    }
}
