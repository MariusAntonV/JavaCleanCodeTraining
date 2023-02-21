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
public class FreelancerTrainer implements Trainer
{
   @Override
   public int deliverExperience( final int difficulty )
   {
      return 60;
   }

@Override
   public int bill( final int difficulty )
   {
      return difficulty * 2;
   }
}
