import java.util.Scanner;
public class IT26102626Lab7Q2B{
	public static void main(String[]args){
		
		int row = 5;
		
		//Loop through the row
		for(int rowCount = 1;rowCount <= row;rowCount++){
			System.out.print(rowCount + " - ");
			//Loop through the column
			for(int columnCount = 1;columnCount <= rowCount;columnCount++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}