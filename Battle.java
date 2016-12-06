
/**
 * The Battle class takes two creatures in its constructor which continually deal damage to 
 * each other until one or both are not alive
 * 
 * @author Dana Sabatino
 * @version 2016.12.05
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private Creature firstCreature;
    private Creature secondCreature;
    int damageFirst;
    int damageSecond;

    /**
     * Battle classs constructor sets up battle between 2 passed creatures
     * @param one   the first creature fightiong in the battle
     * @param two   the other creature fighting in the battle
     */
    public Battle(Creature one, Creature two)
    {
        firstCreature = one;
        secondCreature = two;
        damageFirst = 0;
        damageSecond = 0;
    }

    /**
     * simulates a round of battle (each creature dealing damage to the other) between the 
     * two creature objects passed into the constructor
     */
    public void roundOfBattle()
    {
        damageFirst = firstCreature.damage();
        damageSecond = secondCreature.damage();
        firstCreature.takeDamage(damageSecond);
        secondCreature.takeDamage(damageFirst);
    }
    
    
    /**
     * simulates battle between 2 creatures passed into this object's constructor
     * returns 0 if both creatures are dead after battle, 1 if firstCreature is alive and 
     * secondCreature is dead, and 2 if firstCreature is dead and secondCreature is left alive 
     * after battle is finished
     * 
     * @return   returns the outcome of the battle in integer format
     */
    public int doBattle()
    {
        do
        {
            roundOfBattle();
        }while (firstCreature.isAlive() && secondCreature.isAlive());
        if (!firstCreature.isAlive() && !secondCreature.isAlive())
        {
            System.out.println("both creatures fell while fighting each other");
            return 0;
        }
        else if (!firstCreature.isAlive())
        {
            System.out.println("the creature from army 1 fell in battle");
            return 1;
        }
        else
        {
            System.out.println("the creature from army 2 fell in battle");
            return 2;
        }
    }
}