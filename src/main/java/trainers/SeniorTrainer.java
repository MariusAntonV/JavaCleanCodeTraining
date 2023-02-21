/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
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
