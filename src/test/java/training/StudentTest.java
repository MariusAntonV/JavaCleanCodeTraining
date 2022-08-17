package training;

import org.junit.Assert;
import org.junit.Test;

import thirdparty.ThirdPartyTrainer;
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
      final Student student =
            new Student( "Marius", new Contact( new Address( "Romania", "Cluj-Napoca", "Taietura" ), "1234567" ) );
      student.addCredits( 30 );

      final ITrainer trainer1 = new JuniorTrainer( "Mihai" );
      final ITrainer trainer2 = new MiddleTrainer( "Ionut" );
      final ITrainer trainer3 = new SeniorTrainer( "Andreea" );
      final ITrainer trainer4 = new ThirdPartyTrainer();

      final Topic html = new Topic( "HTML for beginners", 20 );
      final Topic java = new Topic( "Java in action", 50 );
      final Topic apis = new Topic( "Secure APIS", 80 );

      final Training training1 = new Training( html, trainer1, 10 );
      final Training training2 = new Training( java, trainer2, 20 );
      final Training training3 = new Training( apis, trainer3, 30 );

      student.participate( training1 );
      student.participate( training2 );
      student.participate( training3 );

      Assert.assertEquals( 130, student.calculateExperience() );

   }


   @Test
   public void addCredits()
   {
      final Student student =
            new Student( "Marius", new Contact( new Address( "Romania", "Cluj-Napoca", "Taietura" ), "1234567" ) );
      student.addCredits( 30 );
      Assert.assertEquals( 30, student.getAvailableCredits() );
   }
}
