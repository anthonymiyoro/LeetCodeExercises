package recap_lab_exercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

/**
 * @author ALAKA
 */
public class Building extends RealEstate {
    String building_type;
    String date_construction;
    int number_rooms;
    int number_floors;
    int original_price;
    double depreciation_rate;
    double dimension;
    double addArea;
    
    public Building(){
        
    }
    
    public void setBType(String myBType){
        building_type = myBType;
    }
    
    public String getBType(){
        return building_type;
    }
    
    public void setDateConst(String myDate){
        date_construction = myDate;
    }
    public String getDateConst(){
        return date_construction;
    }
    
    public void setNumRoom(int myRoom){
        number_rooms = myRoom;
    }
    
    public int getNumRoom(){
        return number_rooms;
    }
    
    public void setNumFloors(int myFloor){
        number_floors = myFloor;                
    }
    
    public int getNumFloors(){
        return number_floors;
    }
    
    public void setAddArea(double myArea){
        addArea = myArea;
    }
    
    @Override
    public double areaToFeet(double ftArea){
        dimension = ftArea*10.7639;
        return dimension;
    }
    
    public double adareaToFeet(double ftAdArea){
        addArea = ftAdArea*10.7639;
        return addArea;
    }
    
    public double getAddArea(){
        return addArea;
    }
    
    public void setOrigP(int myPrice){
        original_price = myPrice;
    }
    
    public int getOrigP(){
        return original_price;
    }
    
    public void setDepRate(double myDepr){
        depreciation_rate =  myDepr;
    }
    
    public double getDepRate(){
        return depreciation_rate;
    }
    
    @Override
    public void setDimension(double length, double width){
        dimension = (length*width)+getAddArea();
    }
        @Override
    public double getDimension(){
        return dimension;
    }
     public double depreciation_price() throws ParseException{
        double depr_price = getOrigP()*getDepRate()*getYearsElapse();
        return depr_price;    }

//        subtracts depreciation price from original price
     public double final_price(double original,double dep_price) throws ParseException{
         original = getOrigP();
         dep_price = depreciation_price();
         double fin_price = original - dep_price;
         return fin_price;
     }
     
     public void New_Building() throws SQLException{
         Statement s = null;
         DBConnect db = new DBConnect();
         Connection myCon = db.myConnect();
         s = myCon.createStatement();
         
         // SQL Insert
                    String sql = "INSERT INTO building "
                            + "(building_type,date_construction,number_rooms,number_floors,original_price,"
                            + "depreciation_rate,dimension,addArea) "
                            + "VALUES ('" + building_type + "','"
                            + date_construction + "','"
                            + number_rooms+ "'" + ",'"
                            + number_floors + "','"
                            + original_price+ "','"
                            + depreciation_rate+ "','"
                            + dimension+ "','"
                            + addArea+ "') ";
                    s.execute(sql);
     }
    
    
}
