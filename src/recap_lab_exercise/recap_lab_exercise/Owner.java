package recap_lab_exercise;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ALAKA
 */

public class Owner {
    String name;
    int age;
    int ID;
    String type;
    int no_of_property;
    
    public Owner(){
    }
   
    public void setName(String myName){
        name = myName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int myAge){
        age = myAge;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setID(int myID){
    ID =myID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setType(String myType){
        type = myType;
    }
    
    public String getType(){
        return type;
    }
    
    public void NewOwner()throws SQLException{
         Statement s = null;
         DBConnect db = new DBConnect();
         Connection myCon = db.myConnect();
         s = myCon.createStatement();
         
         // SQL Insert
                    String sql = "INSERT INTO owner "
                            + "(name,age,id,type) "
                            + "VALUES ('" + name + "','"
                            + age + "','"
                            + ID+ "'" + ",'"
                            + type + "') ";
                    s.execute(sql);
    }
    
    public int getNoProperty(int myID) throws SQLException{
        //more code goes here
        Statement s = null;
        DBConnect Property = new DBConnect();
        Connection myCon = Property.myConnect();
        s = myCon.createStatement();
        String query = "select * from owner_property where owner_ID ="+myID+" AND "
                + "isActive =1";
        
        ResultSet  rs = s.executeQuery(query);

      try{
        int count = 0;
      while (rs.next()) {
        count++;
        no_of_property = count;
        System.out.println(no_of_property);
      }  
      return no_of_property;

  } catch (Exception e) {
  }
        
        return no_of_property;

    }

    public int getPropertyArea(int myID) throws SQLException{

        //connect to Db and selct all an owners property
        Statement s = null;
        DBConnect Property = new DBConnect();
        Connection myCon = Property.myConnect();
        s = myCon.createStatement();
        String query = "select * from owner_property where owner_ID ="+myID+" AND "
                + "isActive =1";
        ResultSet rs = s.executeQuery(query);

        try{
            int count = 0;
            while (rs.next()) {
                count++;
                no_of_property = count;
            }
            return no_of_property;
        } catch (Exception e) {
        }
        return no_of_property;
    }
    
    public void assignProperty()throws SQLException{
        
         RealEstate re = new RealEstate();
         Statement st = null;
         DBConnect dbc = new DBConnect();
         Connection myConn = dbc.myConnect();
         st = myConn.createStatement();
         
         // SQL Insert
           String sqle = "INSERT INTO owner_property "
                            + "(owner_ID,property_ID) "
                            + "VALUES ('" + ID + "','"
                            + re.getID() + "') ";
                    st.execute(sqle);
}


}