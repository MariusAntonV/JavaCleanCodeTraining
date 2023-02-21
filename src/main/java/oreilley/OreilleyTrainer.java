package oreilley;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class OreilleyTrainer implements Trainer
{
   @Override
   public int deliverExperience( final int difficulty )
   {
      return difficulty * 2;
   }
}
