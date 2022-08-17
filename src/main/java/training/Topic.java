/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package training;

/**
 *
 * @author MAnton
 */
public class Topic
{
   private final String name;

   private final int difficulty;


   public Topic( final String name, final int difficulty )
   {
      this.name = name;
      this.difficulty = difficulty;
   }

//TODO shall we remove this?
   public String getName()
   {
      return this.name;
   }


   public int getDifficulty()
   {
      return this.difficulty;
   }
}
