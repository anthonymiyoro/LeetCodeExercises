package recap_lab_exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static recap_lab_exercise.TimeDiff.getDateDiff;





/**
 * @author ALAKA
 */
public class RealEstate {
    
    double dimensions;
    int ID;
    String Location;
    String year_purchasd;
    
    public RealEstate(){
        
    }
    
    //sets the ID attribute
    public void setID(int myID){
        ID = myID;
    }
    
    //fetch ID onces it is set
    public int getID(){
        return ID;
    }
    
    //sets the location of the estate
    public void setLocation(String myLocation){
        Location = myLocation;
    }
    
    //fetch the location of the estate
    public String getLocation(){
        return Location;
    }
    
    //computes the area of the estate
    public void setDimension(double length, double width){
        dimensions = length*width;
    }
    
    //returns the dimensions of the estate
    public double getDimension(){
        return dimensions;
    }
    
    //setting the date of purchase as a 
    //string to be converted later
    public void setYrpurchased(String myYear){
        year_purchasd = myYear;
    }
    
    public double areaToFeet(double mArea){
        dimensions = mArea*10.7639;
        return dimensions;
    }
    
    //returning the date of purchase
    public String getYrpurchased(){
        return year_purchasd;
    }
    
    //finds the difference between date of purchase and current date
    //and presents it as number of years (for appreciation and depreciation)
     public double getYearsElapse() throws ParseException{         
    //assigning the yr of purchase to variable startDate
        
        String currTime=new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());; 
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(getYrpurchased()); 
        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(currTime);    
        double yearsElapsed = (getDateDiff(date1,date2,TimeUnit.DAYS)/365.25);
        return yearsElapsed;
    }
    
}
