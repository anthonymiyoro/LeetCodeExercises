package recap_lab_exercise;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class Building_Land_Tester extends recap_lab_exercise.RealEstate {
    
    public Building_Land_Tester(){
        
    }
    
    public static void main(String args[]) throws ParseException, SQLException{
        //Welcome the user
        System.out.println("---WELCOME TO THE PROPERTY MGT. SYSTEM---");
        System.out.println();
        System.out.println("Enter 1 to select Building or 2 to Select Lands");
        
        Scanner mychoice = new Scanner(System.in);
        
        
        switch(mychoice.nextInt()){
            case 1:
                System.out.println("---BUILDING Module---\n");
        
                //Create an instance of building class
                recap_lab_exercise.Building mjengo1 = new recap_lab_exercise.Building();

                /*For Group 2B class, we had an error here. This was caused by the fact
                that we were creating an instance of the RealEstate class was a WRONG 
                move!!Remember remote method invocation (RMI), we are supposed to use an
                instance of the child class to call a method in the superclass. So we 
                extend the RealEstate superclass and from there we use mjengo1 instance
                to call the getyearelapsed :-) EYE OPENING!!*/


                //key in building type
                System.out.println("What is the building type\n");
                Scanner btype = new Scanner(System.in);
                String building_type = btype.nextLine();
                mjengo1.setBType(building_type);
                System.out.println("Successful");

                //key in date of construction
                System.out.println("What is the Date of construction\n");
                Scanner dtcnst = new Scanner(System.in);
                String const_date = dtcnst.nextLine();
                mjengo1.setDateConst(const_date);
                System.out.println("Successful\n");

                //key in years of purchase
                System.out.println("What is the year of purchase (dd/mm/yyyy)\n");
                Scanner dtpurch = new Scanner(System.in);
                String purch_date = dtpurch.nextLine();
                mjengo1.setYrpurchased(purch_date);
                System.out.println("Successful\n");

                //key in no of rooms
                System.out.println("How many rooms\n");
                Scanner nroom = new Scanner(System.in);
                int num_room = nroom.nextInt();
                mjengo1.setNumRoom(num_room);
                System.out.println("Successful\n");

                  //key in no of rooms
                System.out.println("How many Floors\n");
                Scanner nfloors = new Scanner(System.in);
                int num_floor = nfloors.nextInt();
                mjengo1.setNumFloors(num_floor);
                System.out.println("Successful\n");

                //key in Original Price
                System.out.println("Original Price?\n");
                Scanner myprice = new Scanner(System.in);
                int or_price = myprice.nextInt();
                mjengo1.setOrigP(or_price);
                System.out.println("Successful\n");

                //key in Depreciation Rate
                System.out.println("Depreciation Rate?\n");
                Scanner mydeprc = new Scanner(System.in);
                double dep_rate = mydeprc.nextDouble();
                mjengo1.setDepRate(dep_rate);
                System.out.println("Successful\n");

                //key in Additional Area in sq metres
                System.out.println("Key in Additional Area in"
                        + " square metres\n");
                Scanner myaddarea = new Scanner(System.in);
                double add_area = myaddarea.nextDouble();
                mjengo1.setAddArea(add_area);
                System.out.println("Successful\n");

                //key in Dimensions
                System.out.println("What is the Length?\n");
                Scanner length = new Scanner(System.in);
                double myl = length.nextDouble();
                System.out.println("What is the Width?\n");
                Scanner width = new Scanner(System.in);
                double myw = width.nextDouble();
                mjengo1.setDimension(myl, myw);
                System.out.println("Successful\n");

                //Print out ALL the details of the Building
                System.out.println("Building Type: "
                        +mjengo1.getBType()+"\n");
                System.out.println("Date of Construction: "
                        +mjengo1.getDateConst()+"\n");
                System.out.println("Year Elapsed: "
                        +mjengo1.getYearsElapse()+"\n");
                System.out.println("Number of Rooms: "
                        +mjengo1.getNumRoom()+"\n");
                System.out.println("Number of Floors: "
                        +mjengo1.getNumFloors()+"\n");
                System.out.println("Original Price: "
                        +mjengo1.getOrigP()+"\n");
                System.out.println("Depreciation Rate: "
                        +mjengo1.getDepRate()+"\n");
                System.out.println("Depreciation Price: "
                        +mjengo1.depreciation_price()+"\n");
                System.out.println("Building Dimension: "
                        +mjengo1.getDimension()+"\n");
                System.out.println("Final Price: "+mjengo1.final_price(mjengo1.getOrigP(),
                        mjengo1.depreciation_price())+"\n");
                mjengo1.New_Building();
                System.out.println("Record Successfully inserted\n");
                System.out.println("\n");
                break;
                
            case 2:
                System.out.println("---LAND Module---\n");
                Land shamba = new Land();
                
                //Key in distance from main road
                System.out.println();
                System.out.println("What is the soil type?");
                Scanner mysoil = new Scanner(System.in);
                String soil_type = mysoil.nextLine();
                shamba.setSoilT(soil_type);
                System.out.println("Successful \n");
                
                //Key in distance from main road                
                System.out.println();
                System.out.println("Distance from main road?");
                Scanner mydist = new Scanner(System.in);
                int dist = mydist.nextInt();
                shamba.setDistRd(dist);
                System.out.println("Successful \n");
                
                //Key in Original price
                System.out.println();
                System.out.println("What is the Original Price?");
                Scanner land_price = new Scanner(System.in);
                int ln_price = land_price.nextInt();
                shamba.setOrigP(ln_price);
                System.out.println("Successful \n");
                
                //Key in appreciation rate
                System.out.println();
                System.out.println("What is the appreciation rate?");
                Scanner app_rate = new Scanner(System.in);
                double ap_rate = app_rate.nextDouble();
                shamba.setAppRate(ap_rate);
                System.out.println("Successful \n");
                
                //Key in Year of purchase
                System.out.println();
                System.out.println("What is the year of purchase?");
                Scanner ln_yr_purch = new Scanner(System.in);
                String ln_purch = ln_yr_purch.nextLine();
                shamba.setYrpurchased(ln_purch);
                System.out.println("Successful \n");
                
                 //Key in Land Serial No
                System.out.println();
                System.out.println("What is Title Deed No.?");
                Scanner t_deed = new Scanner(System.in);
                int tl_deed = t_deed.nextInt();
                shamba.setID(tl_deed);
                System.out.println("Successful \n");
                
                //Let us try and save the record
                shamba.New_Land();
                
                //Now we print all the details old style. We can have one method 
                //that does all this in the Land Class
                System.out.println("Soil Type: "+shamba.getSoilT()+"\n");
                System.out.println("Original Price: "+shamba.getOrigP()+"\n");
                System.out.println("Appreciation Price: "+shamba.appreciation_price()+"\n");
                System.out.println("Year of Purchase: "+shamba.getYrpurchased()+"\n");
                System.out.println("Final Price: "+
                shamba.fin_price(shamba.getOrigP(), shamba.appreciation_price())+"\n");
                System.out.println("Succesfully Inserted!");
                
                break;
            default:
                System.out.println("Wrong Selection!");
                break;
                
        }
        
        
       
    }
    
}
