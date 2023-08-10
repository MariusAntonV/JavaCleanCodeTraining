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

      int experience = 0;
      final int topicDifficulty = this.topic.getDifficulty();

      switch ( trainer.getType() )
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
