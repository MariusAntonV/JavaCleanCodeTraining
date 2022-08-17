package others;

import java.util.function.Consumer;

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


   public void addBonusCredits( final int credits )
   {
      addCreditsInternal( credits, ( c ) -> this.bonusCredits += c );
   }


   public void addCredits( final int credits )
   {
      addCreditsInternal( credits, ( c ) -> this.credits += c );
   }

// remove duplicate code using Consumer ... not necessarily useful in this situation
   private void addCreditsInternal( final int credits, final Consumer<Integer> consumer )
   {
      if ( credits <= 0 )
      {
         return;
      }
      consumer.accept( credits );
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
