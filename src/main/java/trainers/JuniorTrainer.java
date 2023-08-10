package trainers;

/**
 *
 * @author MAnton
 */
public class JuniorTrainer extends AbstractTrainer
{
   public JuniorTrainer( String name )
   {
      super( name );
   }


   @Override
   public int getDeliveredExperience( int topicDifficulty )
   {
      int experience = 0;
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
      return experience;
   }
}
