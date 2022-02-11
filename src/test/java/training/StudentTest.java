package training;

import org.junit.Assert;
import org.junit.Test;

import trainers.Trainer;

/**
 *
 * @author MAnton
 */
public class StudentTest
{

   @Test
   public void deliveredExperience()
   {
      final Student student = new Student( "Marius", "Romania", "Cluj-Napoca", "Taietura", "1234567" );
      student.crds( 30 );

      final Trainer trainer1 = new Trainer( "Mihai", Trainer.J );
      final Trainer trainer2 = new Trainer( "Ionut", Trainer.M );
      final Trainer trainer3 = new Trainer( "Andreea", Trainer.S );

      final Topic html = new Topic( "HTML for beginners", 20 );
      final Topic java = new Topic( "Java in action", 50 );
      final Topic apis = new Topic( "Secure APIS", 80 );

      final TrainPeople training1 = new TrainPeople( html, trainer1, 10 );
      final TrainPeople training2 = new TrainPeople( java, trainer2, 20 );
      final TrainPeople training3 = new TrainPeople( apis, trainer3, 30 );

      student.participate( training1 );
      student.participate( training2 );
      student.participate( training3 );

      Assert.assertEquals( 130, student.exp() );

   }


   @Test
   public void addCredits()
   {
      final Student student = new Student( "Marius", "Romania", "Cluj-Napoca", "Taietura", "1234567" );
      student.crds( 30 );
      Assert.assertEquals( 30, student.creds() );
   }
}
