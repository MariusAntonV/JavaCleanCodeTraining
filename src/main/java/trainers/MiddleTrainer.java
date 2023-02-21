
package trainers;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class MiddleTrainer implements Trainer
{
   @Override
   public int deliverExperience( final int difficulty )
   {
      int experience = 0;
      if ( difficulty < 50 )
      {
         experience += difficulty;
      }
      else
      {
         experience += difficulty * 0.6;
      }
      return experience;
   }
}
