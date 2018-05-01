package recap_lab_exercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
/**
  * @author ALAKA
 */
public class Land extends RealEstate{
    String soil_type;
    int dist_mn_rd;
    int orig_price;
    double apprc_rate;
    
    public Land(){        
    }
    
    public void setSoilT(String mysoilT){
        soil_type = mysoilT;
    }
    
    public String getSoilT(){
        return soil_type;
    }
    
    public void setDistRd(int myDist){
        dist_mn_rd=myDist;
    }
    
    public int getDistRd(){
        return dist_mn_rd;
    }
    
    public void setOrigP(int myOrig){
        orig_price=myOrig;
    }
    
    public int getOrigP(){
        return orig_price;
    }
    
    public void setAppRate(double myAppRate){
        if(dist_mn_rd>=1000){
        apprc_rate = myAppRate+0.05;
    }else{
            apprc_rate = myAppRate;
        }
    }
    
    public double getAppRate(){
        return apprc_rate;
    }
    public double convert_km(int DistMtr){
        dist_mn_rd = DistMtr/1000;
        return dist_mn_rd;
    }
    
    public double appreciation_price() throws ParseException{
        double appr_price = getOrigP()*getAppRate()*getYearsElapse();
        return appr_price;
    }
    
    public double fin_price(int myorig, double mydeprc) throws ParseException{
        myorig = getOrigP();
        mydeprc = appreciation_price();
        double myfin = myorig + mydeprc;
        return myfin;
    }
    
     public void New_Land() throws SQLException{
         Statement s = null;
         Land myl = new Land();
         DBConnect db = new DBConnect();
         Connection myCon = db.myConnect();
         s = myCon.createStatement();
         
         // SQL Insert
                    String sql = "INSERT INTO land "
                            + "(soil_type,dist_mn_rd,orig_price,land_serial) "
                            + "VALUES ('" + soil_type + "','"
                            + dist_mn_rd + "','"
                            + orig_price + "','"
                            + ID+  "') ";
                    s.execute(sql);
     }
}
