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
   public final static String JUNIOR = "junior";
   public final static String MIDDLE = "middle";
   public final static String MIDDLE_2 = "middle2";
   public final static String SENIOR = "senior";

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


   public String getType()
   {
      return this.type;
   }

   public double deliverExperience(int difficulty){

      double experience = 0;

      switch ( getType() )
      {
         case JUNIOR:
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
            break;
         case MIDDLE:
            if ( difficulty < 50 )
            {
               experience = difficulty;
            }
            else
            {
               experience = difficulty * 0.6;
            }
            break;
         case MIDDLE_2:
            if ( difficulty < 50 )
            {
               experience = difficulty;
            }
            else
            {
               experience = difficulty * 0.6;
            }
            break;

         case SENIOR:
            experience = difficulty;
            break;
      }
      return experience;
   }



}
