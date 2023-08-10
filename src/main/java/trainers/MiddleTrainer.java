package trainers;

/**
 *
 * @author MAnton
 */
public class MiddleTrainer extends AbstractTrainer
{
   public  MiddleTrainer( String name )
   {
      super( name );
   }


   @Override
   public int getDeliveredExperience( int topicDifficulty )
   {
      int experience = 0;
      if ( topicDifficulty < 50 )
      {
         experience += topicDifficulty;
      }
      else
      {
         experience += topicDifficulty * 0.6;
      }
      return experience;
   }
}
