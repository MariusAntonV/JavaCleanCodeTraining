/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package trainers;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
public class MiddleTrainer implements ITrainer
{
   private final String name;


   public MiddleTrainer( final String name )
   {
      this.name = name;
   }


   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      int gainedExperience = 0;
      if ( topicDifficulty < 50 )
      {
         gainedExperience += topicDifficulty;
      }
      else
      {
         gainedExperience += topicDifficulty * 0.6;
      }
      return gainedExperience;
   }
}
