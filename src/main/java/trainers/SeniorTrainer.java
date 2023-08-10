package trainers;

/**
 *
 * @author MAnton
 */
public class SeniorTrainer extends AbstractTrainer
{
   public SeniorTrainer( String name )
   {
      super( name );
   }


   @Override
   public int getDeliveredExperience( int topicDifficulty )
   {
      return topicDifficulty;
   }


   @Override
   public void bill( int price )
   {
      //
   }
}
