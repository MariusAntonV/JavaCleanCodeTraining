/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package thirdparty;

import training.ITrainer;

/**
 *
 * @author MAnton
 */
public class ThirdPartyTrainer implements ITrainer
{
   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      return 50;
   }
}
