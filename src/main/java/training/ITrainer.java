package training;

/**
 *
 * @author MAnton
 */
public interface ITrainer
{
   String getName();


   int getDeliveredExperience( int topicDifficulty );

   void bill( int price );
}
