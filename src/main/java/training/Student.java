package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import trainers.Trainer;

/**
 * Represents a student .....
 *
 * @author MAnton
 */
public class Student
{
   private final String name;

   private final String country;

   private final String city;

   private final String street;

   private final String phoneNo;

   private int credits;

   private final List<Training> trainings = new ArrayList<>();

   public Student( final String name, final String country, final String city, final String street,
         final String phoneNo )
   {
      this.name = name;
      this.country = country;
      this.city = city;
      this.street = street;
      this.phoneNo = phoneNo;
   }



   public String printAddress()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.country ).append( ", " ).append( this.city ).append( ", " ).append( this.street );
      return sb.toString();
   }


   public String printContact()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.country ).append( ", " ).append( this.city ).append( ", " ).append( this.street ).append( ", " )
            .append( this.phoneNo );
      return sb.toString();
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
         final int difficulty = training.getTopic().getDifficulty();
         final Trainer trainer = training.getTrainer();

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
                  experience += 0;
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
               experience += difficulty;
               break;
         }

      }

      return experience;
   }
}
