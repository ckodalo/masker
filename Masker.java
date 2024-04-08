public class Masker {

   private Information input;

   public Masker (Information input) {

       this.input = input;
   }

   public Masker() {

   }

    private Information masker (Information input) {

       Information output = new Information();

       String lastName = input.last_name;

        String firstName = input.first_name;

        String email = input.email_address;

        String date = input.date_of_birth;


      String firstEmailChars = email.substring(0, 2);

      String maskedEmail = firstEmailChars + email.substring(2).replaceAll("\\w", "*");

      output.setEmail(maskedEmail);


      String firstDateChars = date.substring(0, 2);

      String maskedDate = firstDateChars + date.substring(2).replaceAll("\\d", "*");

      output.setDate(maskedDate);

       if (lastName.length() > 3) {

          String firstChars = lastName.substring(0,2);

          //i assume all names are validated to be just alphanums
          String maskedLastName = firstChars + lastName.substring(2).replaceAll("\\w", "*");

          output.setLastName(maskedLastName);
       }

       if (lastName.length() <= 3) {

           String firstChars = lastName.substring(0, 1);

           String maskedLastName = firstChars + lastName.substring(1).replaceAll("\\w", "*");

           output.setLastName(maskedLastName);
       }

        if (firstName.length() > 3) {

            String firstChars = firstName.substring(0,2);

            String maskedFirstName = firstChars + lastName.substring(1).replaceAll("\\w", "*");

            output.setFirstName(maskedFirstName);
        }

        if (firstName.length() <= 3) {

            String firstChars = firstName.substring(0, 1);

            String maskedFirstName = firstChars + lastName.substring(1).replaceAll("\\w", "*");

            output.setFirstName(maskedFirstName);
        }


        return output;

    }

   public static void main (String[] args) {

       Masker masker = new Masker();

       Information input = new Information();

       input.first_name = "John";
       input.last_name = "Doe";
       input.date_of_birth = "1990-01-01";
       input.email_address = "john.doe@example.com";

       Information output = masker.masker(input);

       System.out.println("output:");
       System.out.println("First Name: " + output.first_name);
       System.out.println("Last Name: " + output.last_name);
       System.out.println("Date of Birth: " + output.date_of_birth);
       System.out.println("Email Address: " + output.email_address);

   }
}
