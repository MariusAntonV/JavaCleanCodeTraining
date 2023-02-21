
package training;

/**
 *
 * @author MAnton
 */
public class Contact
{
   private final Address address;

   private final String phoneNo;

   public Contact( final Address address, final String phoneNo )
   {
      this.address = address;
      this.phoneNo = phoneNo;
   }


   public Address getAddress()
   {
      return this.address;
   }


   public String getPhoneNo()
   {
      return this.phoneNo;
   }

   public String getContactAsString()
   {
      final StringBuilder sb = new StringBuilder( this.address.getAddressAsString() );
      sb.append( ", " ).append( this.phoneNo );
      return sb.toString();
   }
}
