package recap_lab_exercise;

import java.sql.SQLException;
import java.util.Scanner;

public class Insert_New_Owner extends recap_lab_exercise.Owner {

    public static void main (String args[]) throws SQLException {
        System.out.println("Please input your owner details");
        System.out.println();

//        Create an instance of the owner class to
//        allow variables to be passed from here
        recap_lab_exercise.Owner ownerclass = new Owner();

        //key in owners name after printing out string below :)
        System.out.println("What is your name Mr. Owner ;) \n");
        Scanner owner_name = new Scanner(System.in);
        String owners_name = owner_name.nextLine();
        ownerclass.setName(owners_name);
        System.out.println("Successful");

        //key in owners age after printing out string below :)
        System.out.println("How old are you ? \n");
        Scanner owner_age = new Scanner(System.in);
        int owners_age = Integer.parseInt(owner_age.nextLine());
        ownerclass.setAge(owners_age);
        System.out.println("Cool");


        //key in owners ID after printing out string below :)
        System.out.println("What is your ID ? \n");
        Scanner owner_id = new Scanner(System.in);
        int owners_id = Integer.parseInt(owner_id.nextLine());
        ownerclass.setID(owners_id);
        System.out.println("Got it :)");


        //key in owners type after printing out string below :)
        System.out.println("What is your type? \n");
        Scanner owner_type = new Scanner(System.in);
        String owners_type = owner_type.nextLine();
        ownerclass.setType(owners_type);
        System.out.println("Successful");

//        Run assign property method that saves data to DB
        ownerclass.assignProperty();




    }


}
