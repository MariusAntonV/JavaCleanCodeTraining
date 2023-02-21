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
public class Contact
{
   private final String country;

   private final String city;

   private final String street;

   private final String phoneNo;


   public Contact( final String country, final String city, final String street, final String phoneNo )
   {
      this.country = country;
      this.city = city;
      this.street = street;
      this.phoneNo = phoneNo;
   }


   public String getStreet()
   {
      return this.street;
   }


   public String getCity()
   {
      return this.city;
   }


   public String getCountry()
   {
      return this.country;
   }


   public String getPhoneNo()
   {
      return this.phoneNo;
   }

   public String printAddress()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.country ).append( ", " ).append( this.city ).append( ", " ).append( this.street );
      return sb.toString();
   }


   public String printContact()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.country ).append( ", " ).append( this.city ).append( ", " ).append( this.street ).append( ", " )
            .append( this.phoneNo );
      return sb.toString();
   }
}
