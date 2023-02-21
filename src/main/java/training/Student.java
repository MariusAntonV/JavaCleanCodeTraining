package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import trainers.Trainer;

/**
 *
 * @author MAnton
 */
public class Student
{
   private final String name;

  private final Contact contact;

   private int credits;

   private final List<Training> trainings = new ArrayList<>();


   public Student( final String name, final Contact contact )
   {
      this.name = name;
      this.contact = contact;
   }

   public void participate( final Training training )
   {
      this.trainings.add( training );
   }


   /**
    * Total cost based on past participations.
    *
    * @return totalCost or Optional.empty() if there is no participation.
    */
   public Optional<Integer> getTotalCost()
   {
      if ( this.trainings.isEmpty() )
      {
         return Optional.empty();
      }

      int totalCost = 0;
      for ( final Training aTraining : this.trainings )
      {
         totalCost += aTraining.getCost();
      }

      return Optional.of( totalCost );
   }


   public List<Training> getTrainings()
   {
      return this.trainings;
   }


   public void addCredits( final int credits )
   {
      this.credits += credits;
   }

   public int getCredits(){
      return this.credits;
   }


   /**
    * Calculate total experience for this student based
    * on participation to past trainings
    *
    * @return
    */
   public int calculateExperience()
   {
      int experience = 0;
      for ( final Training aTraining : this.trainings )
      {
         final int difficulty = aTraining.getTopic().getDifficulty();
         final Trainer trainer = aTraining.getTrainer();

         switch ( trainer.getType() )
         {
            case Trainer.JUNIOR:
               if ( difficulty < 30 )
               {
                  experience += difficulty;
               }
               else if ( difficulty < 60 )
               {
                  experience += difficulty / 2;
               }
               else
               {
                  experience += 0;//too difficult
               }
               break;
            case Trainer.MIDDLE:
               if ( difficulty < 50 )
               {
                  experience += difficulty;
               }
               else
               {
                  experience += difficulty * 0.6;
               }
               break;
            case Trainer.SENIOR:
               experience += difficulty;//efficiency is 100%
               break;
         }

      }

      return experience;
   }
}
