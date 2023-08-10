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


   public Topic getTopic()
   {
      return this.topic;
   }


   public ITrainer getTrainer()
   {
      return this.trainer;
   }


   public void addCost( int cost )
   {
      cost += this.cost;
   }


   public int getDeliveredExperience()
   {
      return this.trainer.getDeliveredExperience( this.topic.getDifficulty() );
   }
}
