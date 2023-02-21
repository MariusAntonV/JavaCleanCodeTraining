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
public class TrainerImpl implements Trainer
{

   private final String name;

   private final String type;


   public TrainerImpl( final String name, final String type )
   {
      this.name = name;
      this.type = type;
   }


   public String getName()
   {
      return this.name;
   }


   @Override
   public String getType()
   {
      return this.type;
   }

   @Override
   public int deliverExperience( final int difficulty )
   {
      int experience = 0;
      switch ( this.getType() )
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
               experience += 0;//too difficult
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
            experience += difficulty;//efficiency is 100%
            break;
      }
      return experience;
   }
}
