package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Student
{
   private final String name;

   private final Contact contact;

   private int availableCredits;

   private final List<Training> trainings = new ArrayList<>();


   public Student( final String name, final Contact contact )
   {
      this.name = name;
      this.contact = contact;
   }


   public void participate( final Training training )
   {
      Objects.requireNonNull( training );

      this.trainings.add( training );
   }


   /**
    * @return total trainings cost for which this student already participated
    */
   public Optional<Integer> getTotalCost()
   {
      if ( this.trainings.isEmpty() )
      {
         return Optional.empty();
      }

      return Optional.of( this.trainings.stream().map( Training::getCost ).reduce( 0, Integer::sum ) );
   }

   //TODO can this method be removed?
   public List<Training> getTrainings()
   {
      return this.trainings;
   }


   public void addCredits( final int credits )
   {
      this.availableCredits += credits;
   }


   public int getAvailableCredits()
   {
      return this.availableCredits;
   }


   /**
    *
    * @return experience gained by this student after attending trainings.
    */
   public int calculateExperience()
   {
      int gainedExperience = 0;
      for ( final Training training : this.trainings )
      {
         final int topicDifficulty = training.getTopic().getDifficulty();
         final ITrainer trainer = training.getTrainer();
         gainedExperience += trainer.getDeliveredExperience( topicDifficulty );
      }
      return gainedExperience;
   }
}
