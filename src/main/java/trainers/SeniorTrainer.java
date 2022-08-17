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
public class SeniorTrainer implements ITrainer
{
   private final String name;


   public SeniorTrainer( final String name )
   {
      this.name = name;
   }


   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      return topicDifficulty;
   }
}
