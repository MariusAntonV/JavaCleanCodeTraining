package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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


   public void participate( final Training training )
   {
      this.trainings.add( training );
   }


   public Optional<Integer> getTotalCost(){

      if(this.trainings.isEmpty()){
         return Optional.empty();
      }

      int cost = 0;
      for ( final Training t : this.trainings )
      {
         cost += t.getCost();
      }

      return Optional.of(cost);
   }




   public List<Training> getTrainings()
   {
      return Collections.unmodifiableList(this.trainings);
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
         totalExperience += training.getDeliveredExperience();
      }

      return totalExperience;
   }
}
