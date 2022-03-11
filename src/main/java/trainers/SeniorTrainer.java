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
   private final String name;


   public SeniorTrainer( String name )
   {
      this.name = name;
   }


   @Override
   public String getName()
   {
      return name;
   }

   @Override
   public int deliverExperience( int difficulty )
   {
      return difficulty;
   }
}
