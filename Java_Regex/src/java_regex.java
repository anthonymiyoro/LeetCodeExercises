import java.util.Scanner;
import java.util.regex.*;


public class java_regex {

        public static boolean isEmailValid(String email)
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pattern = Pattern.compile(emailRegex);
            if (email == null) //if email isn't set
                return false;
            return pattern.matcher(email).matches(); //otherwise, exectute match
        }

        public static boolean isMobileValid(String phone_num)
        {
            /** starts with + followed by three digit code number
             followed by - followed by 9 digits */
            String phoneRegex = "^\\+(?:[0-9]?){6,14}[0-9]$";

            Pattern pattern = Pattern.compile(phoneRegex);
            if (phone_num == null) //if mobile isn't set
                return false;
            return pattern.matcher(phone_num).matches(); //otherwise, exectute match
        }

        public static boolean isAccountValid(String bank_acc)
        {
            /* 12 digits */
            String accountRegex = "^[0-9]{1,12}$";

            Pattern pattern = Pattern.compile(accountRegex);
            if (bank_acc == null) //if account isn't set
                return false;
            return pattern.matcher(bank_acc).matches();
        }

        public static boolean isMultipleOfThree(String sub_acc)
        {
            String divByThreeRegex = "/^([0369]|[258][0369]*[147]|[147]([0369]|[147][0369]*"
                    + "[258])*[258]|[258][0369]*[258]([0369]|[147][0369]*[258])*"
                    + "[258]|[147]([0369]|[147][0369]*[258])*[147][0369]*"
                    + "[147]|[258][0369]*[258]([0369]|[147][0369]*[258])*"
                    + "[147][0369]*[147])*$/";

            Pattern pattern = Pattern.compile(divByThreeRegex);
            if (sub_acc == null)
                return false;
            return pattern.matcher(sub_acc).matches();
        }

        public static void main(String[] args) {
            // TODO code application logic here
            Scanner scann = new Scanner(System.in);

            //Email
            System.out.println("Type in an email address: ");
            String email = scann.nextLine();

            if (isEmailValid(email))
                System.out.println("Good, Email is valid");
            else
                System.out.println("Sorry, Email is not valid\n"
                        + "Email must follow pattern username@email.com");

            //Mobile Number
            System.out.println("\nType in a mobile number: ");
            String phone = scann.nextLine();

            if (isMobileValid(phone))
                System.out.println("Good, Mobile number is valid");
            else
                System.out.println("Sorry, Mobile number is not valid"
                        + "Mobile must follow pattern: +254728717881");

            //Bank Account
            System.out.println("\nType in a bank account number: ");
            String account = scann.nextLine();
            String acc_sub = account.substring(5, 9); //6th to 10th digit

            if (isAccountValid(account)) {
                System.out.println("Good, Account number is valid");

                if (account.startsWith("011"))
                    System.out.println("Account number registered at Co-op Bank");
                else if (account.endsWith("085"))
                    System.out.println("Account number registered at Equity Bank");
                else if (isMultipleOfThree(acc_sub))
                    System.out.println("Account number registered at Chase Bank,\n" +
                            "sorry Bank under receivership cannot be used");

            } else {
                System.out.println("Sorry, Account number is not valid"
                        + "\nAccount should not exceed 12 digits");
        }
    }



}
