package training;

/**
 *
 * @author MAnton
 */
public class Training
{
   private final Topic topic;

   private final ITrainer trainer;

   private int cost;


   public Training( final Topic topic, final ITrainer trainer, final int cost )
   {
      this.topic = topic;
      this.trainer = trainer;
      this.cost = cost;
   }


   public int getExperience()
   {
      return this.trainer.getDeliveredExperience( this.topic.getDifficulty() );
   }


   public int getCost()
   {
      return this.cost;
   }
}
