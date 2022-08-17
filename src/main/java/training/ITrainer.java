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
public interface ITrainer
{
   String JUNIOR = "junior";
   String MIDDLE = "middle";
   String SENIOR = "senior";
   String getExperience();

   int getDeliveredExperience( int topicDifficulty );
}
