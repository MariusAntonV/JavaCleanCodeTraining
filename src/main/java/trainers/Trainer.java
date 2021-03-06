/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package trainers;

/**
 *
 * @author MAnton
 */
public class Trainer
{
   public static final String J = "junior";
   public static final String M = "middle";
   public static final String S = "senior";

   private final String name;

   private final String type;

   public Trainer( final String name, final String type )
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
}
