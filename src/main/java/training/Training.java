package training;

/**
 *
 * @author MAnton
 */
public class Training
{
   private final Topic topic;

   private final Trainer trainer;

   private int cost;

   public Training( final Topic topic, final Trainer trainer, final int cost )
   {
      this.topic = topic;
      this.trainer = trainer;
      this.cost = cost;
   }


   public Topic getTopic()
   {
      return this.topic;
   }


   public Trainer getTrainer()
   {
      return this.trainer;
   }


   public void cost( int cost )
   {
      cost += this.cost;
   }


   public int getExperience(){
      return this.trainer.deliverExperience( this.topic.getDifficulty());
   }
}
