package recap_lab_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ALAKA
 */

//Connects to the DB
public class DBConnect {
    
    
    public DBConnect(){
            }
    
     public Connection myConnect(){
      Connection connect = null;
    
    try {
                    Class.forName("com.mysql.jdbc.Driver");

//                    String with DB connection details
                    connect = DriverManager.getConnection("jdbc:mysql://localhost/Property?user=root&password=Amiyoro97");
    
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Cannot connect to Property DB"+e.getMessage());
        }
            return connect;
                
     }

     

}