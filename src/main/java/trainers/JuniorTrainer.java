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
public class JuniorTrainer implements ITrainer
{
   private final String name;


   public JuniorTrainer( String name )
   {
      this.name = name;
   }


   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      int gainedExperience = 0;
      if ( topicDifficulty < 30 )
      {
         gainedExperience += topicDifficulty;
      }
      else if ( topicDifficulty < 60 )
      {
         gainedExperience += topicDifficulty / 2;
      }
      else
      {
         gainedExperience += 0;//too difficult
      }
      return gainedExperience;
   }
}
