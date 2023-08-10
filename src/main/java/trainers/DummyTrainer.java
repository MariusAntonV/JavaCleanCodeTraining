package trainers;

/**
 *
 * @author MAnton
 */
public class DummyTrainer extends AbstractTrainer
{
   DummyTrainer( String name )
   {
      super( name );
   }


   @Override
   public int getDeliveredExperience( int topicDifficulty )
   {
      throw new RuntimeException("I can not deliver this. Sorry!");
   }
}
