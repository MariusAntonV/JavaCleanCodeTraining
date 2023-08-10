package training;

/**
 *
 * @author MAnton
 */
public interface ITrainer
{
   public static final String JUNIOR = "junior";

   public static final String MIDDLE = "middle";

   public static final String SENIOR = "senior";
   String getName();

   String getType();

   int getDeliveredExperience( int topicDifficulty );
}
