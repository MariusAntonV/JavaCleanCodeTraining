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

   private int availableCredits;

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


   public Integer participate( final Training training )
   {
      this.trainings.add( training );

      final int cst = 0;
      for ( final Training t : this.trainings )
      {
         t.getCost( cst );
      }

      return cst;
   }


   public List<Training> getTrainings()
   {
      return this.trainings;
   }


   public void addCredits( final int credits )
   {
      this.availableCredits += credits;
   }

   public int getCredits(){
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
         final Trainer trainer = training.getTrainer();

         switch ( trainer.getExperience() )
         {
            case Trainer.JUNIOR:
               if ( topicDifficulty < 30 )
               {
                  gainedExperience += topicDifficulty;
               }
               else if ( topicDifficulty < 60 )
               {
                  gainedExperience += topicDifficulty / 2;
               }
               else
               {
                  gainedExperience += 0;//too difficult
               }
               break;
            case Trainer.MIDDLE:
               if ( topicDifficulty < 50 )
               {
                  gainedExperience += topicDifficulty;
               }
               else
               {
                  gainedExperience += topicDifficulty * 0.6;
               }
               break;
            case Trainer.SENIOR:
               gainedExperience += topicDifficulty;//efficiency is 100%
               break;
         }

      }

      return gainedExperience;
   }
}
