package recap_lab_exercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Owner_Test extends Owner {
    public static void main (String args[]) throws SQLException {
        System.out.println("Please input your owner details");
        System.out.println();

//        Create an instance of the owner class to
//        allow variables to be passed from here
        recap_lab_exercise.Owner ownerclass = new Owner();

        //key in owners ID after printing out string below :)
        System.out.println("What is your Owners ID ? \n");
        Scanner owner_id = new Scanner(System.in);
        int owners_id = Integer.parseInt(owner_id.nextLine());
        ownerclass.setID(owners_id);
        System.out.println("Got it :)");

        ownerclass.getPropertyArea(owners_id);

    }


}
