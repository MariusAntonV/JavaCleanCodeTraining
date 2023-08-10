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
public class ContractorTrainer extends AbstractTrainer
{
   ContractorTrainer( String name )
   {
      super( name );
   }


   @Override
   public int getDeliveredExperience( int topicDifficulty )
   {
      return 50;
   }

   @Override
   public void bill(int price){
      // ....
   }
}
