import java.util.Scanner;
public class IT26102626Lab7Q1A{
	public static void main (String[]args){
		
		//Declare the variables
		int mark1,mark2,mark3,mark4;
		double avg;
		String grade;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter marks for four subjects");
		
		//Prompt for user to enter the four subject marks
		System.out.print("Enter Subject mark 01: ");
		mark1 = input.nextInt();
		
		System.out.print("Enter Subject mark 02: ");
		mark2 = input.nextInt();
		
		System.out.print("Enter Subject mark 03: ");
		mark3 = input.nextInt();
		
		System.out.print("Enter Subject mark 04: ");
		mark4 = input.nextInt();
		
		//Calculate tha average
		avg = (mark1+mark2+mark3+mark4)/4.0;
		
		//Check the grade based on average
		if(avg >=75 ){
			grade = "Distinction";
		}else if(avg >=50 ){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		//Display the results
		System.out.println();
		System.out.println("Average is: " + avg);
		System.out.println("Overall grade is: " + grade);
	}
}