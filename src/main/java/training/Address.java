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
public class Address
{
   private final String country;

   private final String city;

   private final String street;


   public Address( String country, String city, String street )
   {
      this.country = country;
      this.city = city;
      this.street = street;
   }

   public String printAddress()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.country ).append( ", " ).append( this.city ).append( ", " ).append( this.street );
      return sb.toString();
   }
}
