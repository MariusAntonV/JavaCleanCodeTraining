/************************************************************************
 ** COPYRIGHT: FREQUENTIS AG. All rights reserved.
 **            Registered with Commercial Court Vienna,
 **            reg.no. FN 72.115b.
 ************************************************************************/
package others;

/**
 *
 * @author MAnton
 */
public class WalletUser
{
   private Wallet wallet;

   public void useWallet()
   {
      if ( wallet.consumeCredits( 4 ) == Wallet.Code.OK )
      {
         System.out.println( "Do something" );
      }
      else
      {
         System.out.println( "No credits available" );
      }
   }
}
