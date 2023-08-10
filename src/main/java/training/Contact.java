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




   public String printContact()
   {

      final StringBuilder sb = new StringBuilder( this.address.printAddress() );
      sb.append( ", " ).append( this.phoneNo );
      return sb.toString();
   }
}
