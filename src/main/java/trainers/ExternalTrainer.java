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
public class ExternalTrainer implements Trainer
{
   @Override
   public String getName()
   {
      return null;
   }


   @Override
   public int deliverExperience( int difficulty )
   {
      return difficulty * 2;
   }

   public void pay(int cost){
      //adding this method to Trainer interface will break Interface Segregation
   }
}
