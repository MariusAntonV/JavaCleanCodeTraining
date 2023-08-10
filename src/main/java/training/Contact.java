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


   public Contact( String country, String city, String street, String phoneNo )
   {
      this.country = country;
      this.city = city;
      this.street = street;
      this.phoneNo = phoneNo;
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
