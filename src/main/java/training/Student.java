package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import others.ConcurrencyUtils;

/**
 * Represents a student .....
 *
 * @author MAnton
 */
public class Student
{
   private Contact contact;

   private int credits;

   private final List<Training> trainings = new ArrayList<>();

   public Student( final Contact contact )
   {
      this.contact = contact;
   }

   public String printContact()
   {
      return this.contact.printContact();
   }

   public void participate( final Training training )
   {
      Objects.requireNonNull(training);
      this.trainings.add( training );
   }

   public Optional<Integer> getCost(){

      if(this.trainings.size() == 0){
         return Optional.empty();
      }

      int cost = 0;
      for ( final Training aTraining : this.trainings )
      {
         cost += aTraining.getCost();
      }

      return Optional.of( cost );
   }


   public List<Training> getTrainings()
   {
      return Collections.unmodifiableList( this.trainings );
   }


   public void addCredits( final int credits )
   {
      ConcurrencyUtils.runOnBusyThread( () -> this.credits += credits);
   }

   public int getCredits(){
      return this.credits;
   }


   /**
    *
    * @return experience based on previous participations to trainings
    */
   public int calculateExperience()
   {
      return this.trainings.stream()
            .map( Training::getExperience )
            .reduce( 0, Integer::sum );
   }
}
