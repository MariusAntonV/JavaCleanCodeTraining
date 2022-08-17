/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package trainers;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
public class Trainer implements ITrainer
{
   private final String name;

   private final String experience;

   public Trainer( final String name, final String experience )
   {
      this.name = name;
      this.experience = experience;
   }

   @Override
   public String getExperience()
   {
      return this.experience;
   }
}
