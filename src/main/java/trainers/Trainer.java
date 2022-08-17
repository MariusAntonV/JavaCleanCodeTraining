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
public class Trainer implements ITrainer
{
   private final String name;

   private final String experience;

   public Trainer( final String name, final String experience )
   {
      this.name = name;
      this.experience = experience;
   }


   @Override
   public String getExperience()
   {
      return this.experience;
   }


   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      int gainedExperience = 0;
      switch ( this.getExperience() )
      {
         case ITrainer.JUNIOR:
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
            break;
         case ITrainer.MIDDLE:
            if ( topicDifficulty < 50 )
            {
               gainedExperience += topicDifficulty;
            }
            else
            {
               gainedExperience += topicDifficulty * 0.6;
            }
            break;
         case ITrainer.SENIOR:
            gainedExperience += topicDifficulty;//efficiency is 100%
            break;
      }
      return gainedExperience;
   }
}
