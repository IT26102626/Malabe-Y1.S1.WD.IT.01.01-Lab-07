import java.util.Scanner;
public class IT26102626Lab7Q2A{
	public static void main(String[]args){
		
		int row = 4;
		int column = 5;
		
		//Loop through the row
		//Start with 0--> 0,1,2,3
		for(int rowCount = 0;rowCount < row;rowCount++){
			
			//Loop through the column
			//Start with 0--> 0,1,2,3,4
			for(int columnCount = 0;columnCount < column;columnCount++){
				System.out.print("$");
			}
			System.out.println();
		}
	}
}