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
      this.credits = addCredit( credits, this.credits );
   }


   public void addBonusCredits( final int credits )
   {
      this.bonusCredits = addCredit( credits, this.bonusCredits );
   }

   private int addCredit( int credits, int target )
   {
      if ( credits <= 0 )
      {
         //log
         return 0;
      }

      return target + credits;
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
