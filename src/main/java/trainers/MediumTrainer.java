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
public class MediumTrainer implements Trainer
{
   private final String name;


   public MediumTrainer( String name )
   {
      this.name = name;
   }


   @Override
   public String getName()
   {
      return name;
   }

   @Override
   public double deliverExperience( int difficulty )
   {
      double experience = 0;
      if ( difficulty < 50 )
      {
         experience = difficulty;
      }
      else
      {
         experience = difficulty * 0.6;
      }
      return experience;
   }
}
