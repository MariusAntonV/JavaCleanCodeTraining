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
      addSomeCredits( credits, () -> this.credits += credits );
   }


   public void addBonusCredits( final int credits )
   {
      addSomeCredits( this.bonusCredits, () -> this.bonusCredits += credits );
   }


   private void addSomeCredits( final int credits, final Runnable addCreditsRunnable )
   {
      if ( credits < 0 )
      {
         return;
      }

      addCreditsRunnable.run();
   }


   public void addCredits( final int credits, final boolean isBonus )
   {
      if ( credits < 0 )
      {
         return;
      }

      if ( isBonus )
      {
         this.bonusCredits += credits;
      }
      else
      {
         this.credits += credits;
      }
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
