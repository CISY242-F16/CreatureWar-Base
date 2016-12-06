import java.util.Random;
/**
 * Creature class if a parent class of Human, Elf, Demon, CyberDemon, and Balrog classes, used to store fields, hp and strength
 * 
 * @author Dana Sabatino 
 * @version 2016.12.05
 */
public class Creature
{
   protected int hp;
   protected int strength;
   protected Random rand = new Random();
   /**
    * Default constructor for Creature class, sets hp and strenght to 10 each.
    */
   
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
   
   /**
    * Alternate Constructor for Creature Class
    * @param random     determines if this instance's field are set by random between 5 and 10 if random = true
    * @param str        if random = false, sets strength field to str
    * @param hitpoints  if random = false, sets hp fiedl to hitpoints
    */
   
   public Creature(boolean random, int str, int hitpoints)
   {
       if (random)
       {
           hp = 5 + rand.nextInt(6);
           strength = 5 + rand.nextInt(6);
       }
       else
       {
           if(str < 5)
           {
               strength = 5;
           }
           else
           {
           strength = str;
           }
           if (hitpoints < 5)
           {
           hp = 5;
           }
           else
           {
           hp = hitpoints;
           }
        }
   }
   
   /** 
    * Returns a random damage number between 1 and the strength field of this object
    * @return   returns a random number between 1 and creature object's strenght
    */
   
   public int damage(){
       return (1 + rand.nextInt(strength));
    }
    
   /**
    * returns true if object's hp are greater than 0, false if objects hp are < 0
    * @return  returns true if creature object's hp are above 0 and flase if 
    *           creature object's hp are 0 or below
    */
    public boolean isAlive()
   {
       return hp > 0 ? true : false;
   }
   
   /**
    * subtracts the amount of damage done to the creature from its hp
    * @param dam    the points of damage to be subtracted from current Creature object's hp
    */
   public void takeDamage(int dam)
   {
       if (dam > 0)
       {
           hp = hp - dam;
       }
   }
}
