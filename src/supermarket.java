import java.util.Scanner;
public class supermarket {


	public static void main(String[] args) {
		System.out.println("List of Available Items");
		System.out.println("");
		System.out.println("Cereals");
		System.out.println("Maize: Ksh. 20 bob per cob");
		System.out.println("Rice: Ksh. 100 per Kg. 0.5 Kg: Ksh. 50");
		System.out.println("Sorgum: Ksh. 120 per kg. 0.5 kg: Ksh.60");
		System.out.println("Oats: Ksh. 235 per Kg. 0.5 Kg: Ksh. 118 ");
		System.out.println("Millet: Ksh.145 per Kg. 0.5Kg: Ksh.73");
		System.out.println("");
		System.out.println("Beverages");
		System.out.println("Soda: Ksh.99per Litre NOW Ksh.75");
		System.out.println("Milk: Ksh.102 per Litre");
		System.out.println("Water: Ksh.40 per Litre NOW Ksh.20");
		System.out.println("");
		System.out.println("Vegetables");
		System.out.println("Kales: Ksh 40 per Bunch");
		System.out.println("Spinach: Ksh 50 per bunch");
		System.out.println("Cabbage: Ksh 65 per bunch");
		System.out.println("");
		System.out.println("Flour");
		System.out.println("Maize Flour:Jembe: Ksh. 98 per 2Kg NOW ksh.65 per 2kg");
		System.out.println("Jogoo: Ksh. 88 per 2Kg NOW ksh.66 per 2kg 0.5kg: Ksh.17");
		System.out.println("Wheat Flour:EXE: Ksh.123 per 2Kg 0.5kg: Ksh.31");
		System.out.println("Wheat Flour:Taifa: Ksh.120 per 2Kg 0.5kg: Ksh.30");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");

		System.out.println("MENU  ");	
		System.out.println("Kindly separate your order with spaces ");
		System.out.println("  ");
		 System.out.println("Press 1 for maize");
		 System.out.println("Press 2 for rice ");
		 System.out.println("Press 3 for sorghum");
		 System.out.println("Press 4 for oats");
		 System.out.println("Press 5 for millet");
		 System.out.println("Press 6 for soda");
		 System.out.println("Press 7 for milk");
		 System.out.println("Press 8 for water");
		 System.out.println("Press 9 for kales");
		 System.out.println("Press 10 for spinach");
		 System.out.println("Press 11 for cabbage");
		 System.out.println("Press 12 for jembe");
		 System.out.println("Press 13 for Jogoo");
		 System.out.println("Press 14 for EXE");
		 System.out.println("Press 15 for TAIFA");
		 
	
		
		 
		 String products[] ={"Maize","Rice","Sorghum","Oats","Millet","Soda","Milk","Water","Kales","Spinach"
				 ,"Cabbage","Jembe","Jogoo","EXE","Taifa"};
		 int prices[] ={20,100,120,235,145,75,102,20,40,50,65,98,88,123,120};

		 Scanner num = new Scanner(System.in);
		 String response = num.nextLine();
		 
		 response.split(" ");
	}

}
