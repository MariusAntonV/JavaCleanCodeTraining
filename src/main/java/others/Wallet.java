package others;

/**
 *
 * @author MAnton
 */
public class Wallet
{
   public enum Code
   {
      OK, INSUFFICIENT_FUNDS
   }

   private int credits = 0;

   private int bonusCredits = 0;


   public void addCredits( final int credits )
   {
      addCreditsTo( () -> this.credits += credits );
   }


   public void addBonusCredits( final int credits )
   {
      addCreditsTo( () -> this.bonusCredits += credits );
   }


   private void addCreditsTo( Runnable addCredits )
   {
      if ( credits < 0 )
      {
         return;
      }

      addCredits.run();
   }


   public Code consumeCredits( final int noOfCreditsToConsume )
   {
      if ( this.credits >= noOfCreditsToConsume )
      {
         this.credits -= noOfCreditsToConsume;
         return Code.OK;
      }
      else
      {
         return Code.INSUFFICIENT_FUNDS;
      }
   }


   public boolean hasBonusCredits()
   {
      return this.bonusCredits > 0;
   }

}
