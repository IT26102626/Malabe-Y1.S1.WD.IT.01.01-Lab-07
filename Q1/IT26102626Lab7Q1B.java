import java.util.Scanner;
public class IT26102626Lab7Q1B{
	public static void main (String[]args){
		
		//Declare the variables
		int mark1,mark2,mark3,mark4;
		double avg;
		String grade;
		int studentCount = 1;
		
		Scanner input = new Scanner(System.in); 
		
		while(studentCount<=3){
			
			System.out.println("Student " + studentCount);
			
			System.out.print("Enter marks: ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
		
		//Calculate the average
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
		System.out.println();
		//Student count + 1
		studentCount++;
		}
	}
}