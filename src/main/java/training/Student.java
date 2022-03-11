package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

      final int cost = 0;
      for ( final Training aTraining : this.trainings )
      {
         aTraining.cost( cost );
      }

      return Optional.of( cost );
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
    *
    * @return experience based on previous participations to trainings
    */
   public int calculateExperience()
   {
      int experience = 0;
      for ( final Training training : this.trainings )
      {
         experience += training.getExperience();
      }

      return experience;
   }



}
