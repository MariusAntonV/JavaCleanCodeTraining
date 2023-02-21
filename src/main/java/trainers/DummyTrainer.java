
package trainers;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class DummyTrainer implements Trainer
{
   @Override
   public int deliverExperience( final int difficulty )
   {
      throw new RuntimeException( "I can not deliver this!!!!" );
   }
}
