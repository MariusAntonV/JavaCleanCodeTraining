package trainers;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class SeniorTrainer implements Trainer
{
   @Override
   public int deliverExperience( final int difficulty )
   {
      return difficulty;
   }
}
