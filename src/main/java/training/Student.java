package training;

import java.util.ArrayList;
import java.util.List;

import trainers.Trainer;

/**
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

   private final List<Training> trainings = new ArrayList<>();

   private int totalCredits;


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

   public int getTotalCredits(){
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
         final Trainer trainer = training.getTrainer();

         switch ( trainer.getType() )
         {
            case Trainer.JUNIOR:
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
            case Trainer.MIDDLE:
               if ( topicDifficulty < 50 )
               {
                  totalExperience += topicDifficulty;
               }
               else
               {
                  totalExperience += topicDifficulty * 0.6;
               }
               break;
            case Trainer.SENIOR:
               totalExperience += topicDifficulty;//efficiency is 100%
               break;
         }

      }

      return totalExperience;
   }
}
