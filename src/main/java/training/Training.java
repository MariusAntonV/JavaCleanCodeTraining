package training;

import trainers.Trainer;

/**
 *
 * @author MAnton
 */
public class Training
{
   private final Topic topic;

   private final Trainer trainer;

   private int cost;

   public Training( final Topic topic, final Trainer tutor, final int cost )
   {
      this.topic = topic;
      this.trainer = tutor;
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


   public void addCost( int cost )
   {
      cost += this.cost;
   }
}
