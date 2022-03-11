/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package university;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class UniveristyTrainer implements Trainer
{
   @Override
   public String getName()
   {
      return null;
   }


   @Override
   public double deliverExperience( int difficulty )
   {
      return 200;
   }
}
