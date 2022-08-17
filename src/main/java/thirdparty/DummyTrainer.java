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
public class DummyTrainer implements ITrainer
{
   @Override
   public int getDeliveredExperience( final int topicDifficulty )
   {
      //DO NOT DO THIS .... Liskov principle will be broken
      throw new RuntimeException( "Too dummy to deliver something!" );
   }
}
