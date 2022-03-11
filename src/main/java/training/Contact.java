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
class Contact
{
   private final String name;

   private final Address address;

   private final String phoneNo;


   public Contact( String name, Address address, String phoneNo )
   {
      this.name = name;
      this.address = address;
      this.phoneNo = phoneNo;
   }

   public String printContact()
   {
      final StringBuilder sb = new StringBuilder( "" );
      sb.append( this.name ).append( ", " ).append( this.address.printAddress() ).append( ", " )
            .append( this.phoneNo );
      return sb.toString();
   }
}
