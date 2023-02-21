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
public interface Trainer
{
   String JUNIOR = "junior";

   String MIDDLE = "middle";

   String SENIOR = "senior";

   String getType();

   int deliverExperience( int difficulty );
}
