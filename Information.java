public class Information {


        // user private info
        String first_name;
        String last_name;

        String date_of_birth;

        String email_address;

        // we need a constructor

        public Information(String first_name, String last_name, String date_of_birth, String email_address) {

                this.first_name = first_name;
                this.last_name = last_name;
                this.date_of_birth = date_of_birth;
                this.email_address = email_address;
        }

        // a non-args constructor too

        public Information() {

        }

        //need setters
        public void setFirstName(String first_name) {
             this.first_name = first_name;
        }

        public void setLastName(String last_name) {
                this.last_name = last_name;
        }

        public void setDate(String date_of_birth) {
                this.date_of_birth = date_of_birth;
        }

        public void setEmail(String email_address) {
                this.email_address = email_address;
        }

}
