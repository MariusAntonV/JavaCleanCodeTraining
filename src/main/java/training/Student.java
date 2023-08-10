package training;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAnton
 */
public class Student
{
   private final String name;

   private final Contact contact;

   private final List<Training> trainings = new ArrayList<>();

   private int totalCredits;


   public Student( final String name, Contact contact )
   {
      this.name = name;
      this.contact = contact;
   }


   public Integer participate( final Training training )
   {
      this.trainings.add( training );

      final int cst = 0;
      for ( final Training t : this.trainings )
      {
         t.addCost( cst );
      }

      return cst;
   }


   public List<Training> getTrainings()
   {
      return this.trainings;
   }


   public void addCredit( final int credit )
   {
      this.totalCredits += credit;
   }


   public int getTotalCredits()
   {
      return this.totalCredits;
   }


   /**
    * Calculates total student experience based on previous training participation.
    * @return total calculated experience
    */
   public int calculateExperience()
   {
      int totalExperience = 0;
      for ( final Training training : this.trainings )
      {
         final int topicDifficulty = training.getTopic().getDifficulty();
         final ITrainer trainer = training.getTrainer();

         switch ( trainer.getType() )
         {
            case ITrainer.JUNIOR:
               if ( topicDifficulty < 30 )
               {
                  totalExperience += topicDifficulty;
               }
               else if ( topicDifficulty < 60 )
               {
                  totalExperience += topicDifficulty / 2;
               }
               else
               {
                  totalExperience += 0;//too difficult
               }
               break;
            case ITrainer.MIDDLE:
               if ( topicDifficulty < 50 )
               {
                  totalExperience += topicDifficulty;
               }
               else
               {
                  totalExperience += topicDifficulty * 0.6;
               }
               break;
            case ITrainer.SENIOR:
               totalExperience += topicDifficulty;//efficiency is 100%
               break;
         }

      }

      return totalExperience;
   }
}
