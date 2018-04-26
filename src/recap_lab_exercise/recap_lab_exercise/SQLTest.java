package recap_lab_exercise;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLTest {

        public static void main(String [] args) throws Exception {
            // Class.forName( "com.mysql.jdbc.Driver" ); // do this in init
            // // edit the jdbc url
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/Property?user=root&password=Amiyoro97");
            // Statement st = conn.createStatement();
            // ResultSet rs = st.executeQuery( "select * from table" );

            System.out.println("Connected?");
        }
}
