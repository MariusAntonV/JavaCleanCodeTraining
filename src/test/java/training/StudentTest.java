package training;

import org.junit.Assert;
import org.junit.Test;

import trainers.JuniorTrainer;
import trainers.MiddleTrainer;
import trainers.SeniorTrainer;

/**
 *
 * @author MAnton
 */
public class StudentTest
{

   @Test
   public void deliveredExperience()
   {
      //given
      final Student student =
            new Student( "Marius", new Contact( new Address( "Romania", "Cluj-Napoca", "Taietura" ), "1234567" ) );
      student.addCredits( 30 );

      final Trainer trainer1 = new JuniorTrainer();
      final Trainer trainer2 = new MiddleTrainer();
      final Trainer trainer3 = new SeniorTrainer();

      final Topic html = new Topic( "HTML for beginners", 20 );
      final Topic java = new Topic( "Java in action", 50 );
      final Topic apis = new Topic( "Secure APIS", 80 );

      final Training training1 = new Training( html, trainer1, 10 );
      final Training training2 = new Training( java, trainer2, 20 );
      final Training training3 = new Training( apis, trainer3, 30 );

      //when
      student.participate( training1 );
      student.participate( training2 );
      student.participate( training3 );

      //then
      Assert.assertEquals( 130, student.calculateExperience() );
   }


   @Test
   public void addCredits() throws InterruptedException
   {
      final Student student =
            new Student( "Marius", new Contact( new Address( "Romania", "Cluj-Napoca", "Taietura" ), "1234567" ) );
      student.addCredits( 30 );

      //DO not use sleep of max timeout
//      Thread.sleep( 10000 );
//      Assert.assertEquals( 30, student.getCredits() );
      Assert.assertTrue( verifyCredits(30, student, 10_000) );
   }

   private boolean verifyCredits( final int expected, final Student student, final int timeoutInMillis ) throws InterruptedException
   {
      final int pace = 100;
      final int noOfTries = timeoutInMillis / pace;

      for ( int i = 0; i < noOfTries; i++ )
      {
         final int credits = student.getCredits();
         if ( credits == expected )
         {
            return true;
         }
         Thread.sleep( pace );
      }
      return false;
   }
}
