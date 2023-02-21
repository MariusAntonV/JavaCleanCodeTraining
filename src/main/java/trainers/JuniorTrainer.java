
package trainers;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class JuniorTrainer implements Trainer
{

   @Override
   public int deliverExperience( final int difficulty )
   {
      int experience = 0;
      if ( difficulty < 30 )
      {
         experience += difficulty;
      }
      else if ( difficulty < 60 )
      {
         experience += difficulty / 2;
      }
      else
      {
         experience += 0;//too difficult
      }
      return experience;
   }
}
