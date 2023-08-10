package trainers;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
abstract class AbstractTrainer implements ITrainer
{
   private final String name;


   AbstractTrainer( String name )
   {
      this.name = name;
   }


   @Override
   public String getName()
   {
      return name;
   }

}
