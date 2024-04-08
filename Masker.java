import java.util.Map;

public class Masker {

    public Object masker(Object object) {
        if (object instanceof Object) {
            Object customObject = (Object) object;
            // Masking logic for each string field
            customObject.first_name = maskString(customObject.first_name);
            customObject.last_name = maskString(customObject.last_name);
            customObject.date_of_birth = maskString(customObject.date_of_birth);
            customObject.email_address = maskString(customObject.email_address);
            return customObject;
        }
    }

    private String maskString(String input) {
        if (input != null && input.length() > 2) {

            String firstTwoChars = input.substring(0, 2);
            String maskedChars = input.substring(2).replaceAll(".", "*");
            return firstTwoChars + maskedChars;
        } else {
            return input;
        }
    }

    public static void main(String[] args) {
        // Example usage
        Masker masker = new Masker();

        // Create an instance of your custom Object class
        Object obj = new Object();
        obj.first_name = "John";
        obj.last_name = "Doe";
        obj.date_of_birth = "1990-01-01";
        obj.email_address = "john.doe@example.com";

        // Mask the object
        Object maskedObject = masker.masker(obj);

        // Print the masked object
        System.out.println("Masked Object:");
        System.out.println("First Name: " + maskedObject.first_name);
        System.out.println("Last Name: " + maskedObject.last_name);
        System.out.println("Date of Birth: " + maskedObject.date_of_birth);
        System.out.println("Email Address: " + maskedObject.email_address);
    }
}
