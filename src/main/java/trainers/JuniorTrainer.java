/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package trainers;

import training.Trainer;

/**
 *
 * @author MAnton
 */
public class JuniorTrainer implements Trainer
{
   private final String name;


   public JuniorTrainer( String name )
   {
      this.name = name;
   }


   @Override
   public String getName()
   {
      return name;
   }

   @Override
   public int deliverExperience( int difficulty )
   {
      int experience = 0;
      if ( difficulty < 30 )
      {
         experience = difficulty;
      }
      else if ( difficulty < 60 )
      {
         experience = difficulty / 2;
      }
      else
      {
         experience = 0;
      }
      return experience;
   }
}
