import java.util.Scanner;
public class IT26102626Lab7Q3{
	public static void main(String[]args){
		
		//Declare the discount rate as a constant
		final double  discountRate = 0.05;
		
		//Declare the varibles
		double billAmount,discount;
		double amountToPay = 0;
		char paymentMode;
		
		Scanner input = new Scanner(System.in);
		
		//Loop for 5 customers
		for(int count = 1;count<=5;count++){
			System.out.println("Customer " + count);
			
			//Prompt user to enter the bill amount
			System.out.print("Enter total bill amount: ");
			billAmount = input.nextDouble();
			
			//Prompt user to enter the mode of payment
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			paymentMode = input.next().toUpperCase().charAt(0);
			
			//Check payment mode
			if(paymentMode == 'C'|| paymentMode == 'c'){
				//Calculating the discount
				discount = billAmount*discountRate;
				System.out.println("Discount is: " + discount);
				amountToPay = billAmount - discount;
				
				//No discount
			}else if(paymentMode == 'O' || paymentMode == 'o'){
				discount = 0;
				amountToPay = billAmount;
				System.out.println("No discount applicable");
				
				//Invalid option
			}else{
				System.out.println("Payment Mode is not valid");
				//Skip to the next customer
				continue;
			}
			
			System.out.println("Amount to be paid: " + amountToPay);
			System.out.println();
		}
	}
}