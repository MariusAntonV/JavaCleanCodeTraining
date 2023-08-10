package trainers;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
public class Trainer implements ITrainer
{


   private final String name;

   private final String type;


   public Trainer( final String name, final String type )
   {
      this.name = name;
      this.type = type;
   }


   @Override
   public String getName()
   {
      return this.name;
   }


   @Override
   public String getType()
   {
      return this.type;
   }
}
