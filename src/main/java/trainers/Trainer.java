package trainers;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
public class Trainer implements ITrainer
{


   private final String name;

   private final String type;


   public Trainer( final String name, final String type )
   {
      this.name = name;
      this.type = type;
   }


   @Override
   public String getName()
   {
      return this.name;
   }


   @Override
   public String getType()
   {
      return this.type;
   }

   @Override
   public int getDeliveredExperience(int topicDifficulty){
      int experience = 0;
      switch ( type )
      {
         case ITrainer.JUNIOR:
            if ( topicDifficulty < 30 )
            {
               experience += topicDifficulty;
            }
            else if ( topicDifficulty < 60 )
            {
               experience += topicDifficulty / 2;
            }
            else
            {
               experience += 0;//too difficult
            }
            break;
         case ITrainer.MIDDLE:
            if ( topicDifficulty < 50 )
            {
               experience += topicDifficulty;
            }
            else
            {
               experience += topicDifficulty * 0.6;
            }
            break;
         case ITrainer.SENIOR:
            experience += topicDifficulty;//efficiency is 100%
            break;
      }
      return experience;
   }
}
