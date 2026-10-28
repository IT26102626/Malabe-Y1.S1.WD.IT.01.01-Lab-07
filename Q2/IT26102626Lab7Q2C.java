import java.util.Scanner;
public class IT26102626Lab7Q2C{
	public static void main(String[]args){
		//Declare variables 
		int row,column;
		
		//Loop through the row
		for(row = 5;row>=1;row--){
			//Loop through the column
			for(column=1;column<=row;column++){
				System.out.print(row);
			}
			//Takes the cursor to the next line
			System.out.println();
		}
	}
}