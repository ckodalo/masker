import java.util.Map;

public class Masker {

    public Object masker(Object object) {
        if (object != null) {
            // Masking logic for each string field
            ((Object) object).first_name = maskString(((Object) object).first_name);
            ((Object) object).last_name = maskString(((Object) object).last_name);
            ((Object) object).date_of_birth = maskString(((Object) object).date_of_birth);
            ((Object) object).email_address = maskString(((Object) object).email_address);
            return (Object) object;
        }
        return object;
    }

    private String maskString(String input) {
        if (input != null && input.length() > 3) {

            String firstTwoChars = input.substring(0, 2);
            String maskedChars = input.substring(2).replaceAll(".", "*");
            return firstTwoChars + maskedChars;
        }

        else if(input != null && input.length() <= 3 ) {

            String firstChars = input.substring(0, 1);

            String maskedChars = input.substring(1).replaceAll(".", "*");
        }


        //else {
            //return input;
        //}
        return input;
    }

    public static void main(String[] args) {

        Masker masker = new Masker();


        Object obj = new Object();
        obj.first_name = "John";
        obj.last_name = "Doe";
        obj.date_of_birth = "1990-01-01";
        obj.email_address = "john.doe@example.com";


        Object maskedObject = masker.masker(obj);

        System.out.println("Masked Object:");
        System.out.println("First Name: " + maskedObject.first_name);
        System.out.println("Last Name: " + maskedObject.last_name);
        System.out.println("Date of Birth: " + maskedObject.date_of_birth);
        System.out.println("Email Address: " + maskedObject.email_address);
    }
}
