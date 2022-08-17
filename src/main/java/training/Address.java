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
class Address
{
   private final String country;

   private final String city;

   private final String street;


   Address( String country, String city, String street )
   {
      this.country = country;
      this.city = city;
      this.street = street;
   }


   public String getCountry()
   {
      return country;
   }


   public String getStreet()
   {
      return street;
   }


   public String getCity()
   {
      return city;
   }

   public String printAddress()
   {
      return "" + this.country + ", " + this.city + ", " + this.street;
   }
}
