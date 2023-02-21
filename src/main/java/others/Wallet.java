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

   public void addCredits( final int credits, final boolean isBonus )
   {
      if ( credits <= 0 )
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


   public Code consumeCredits_oneReturn( final int noOfCreditsToConsume )
   {
      Code code = Code.INSUFFICIENT_FUNDS;
      if ( this.credits >= noOfCreditsToConsume )
      {
         this.credits -= noOfCreditsToConsume;
         code = Code.OK;
      }

      return code;
   }


   public boolean hasBonusCredits()
   {
      return this.bonusCredits > 0;
   }

}
