import java.util.Scanner;

public class RestaurantBill {
		
		public static void main(String[] args) {
			
			double TotalPrice,TaxAmt,FinAmt;
			
			@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);
			
		    System.out.println("Enter price-1:");
		    double pr1 = myObj.nextDouble();  
		    System.out.println("Price 1 is: " + pr1); 
		    
		    System.out.println("Enter price-2:");
		    double pr2 = myObj.nextDouble();  
		    System.out.println("Price 2 is: " + pr2);
		    
		    System.out.println("Enter price-3:");
		    double pr3 = myObj.nextDouble();  
		    System.out.println("Price 3 is: " + pr3);
		    
		    System.out.println("Enter the Tax%:");
		    double tax = myObj.nextDouble();
		    System.out.println("Tax% is: " + tax);
		    
		    TotalPrice=pr1+pr2+pr3;
		    TaxAmt=tax/100*TotalPrice;
		    System.out.println("TaxAmount is: " + TaxAmt);
		    FinAmt=TotalPrice+TaxAmt;
		    System.out.println("FinalAmount is: " + FinAmt);
		    
		    
		}

	}


