package assignment;

public class twodimensionalarray {

	public static void main(String[] args) {

		String x[][]= new String[3][4]; // declaring rows and column of the array
		System.out.println(x.length);// total no of rows- 3
		System.out.println(x[0].length);// total no of column - 4

		
		// GIVING VALUES TO 1st ROW AND COLUMN
		x[0][0]= "A";
		x[0][1]= "B";
		x[0][2]= "C";
		x[0][3]= "D";
		
		
		// GIVING VALUES TO 2nd ROW AND COLUMN
		x[1][0]= "A1";
		x[1][1]= "B1";
		x[1][2]= "C1";
		x[1][3]= "D1";
		
		
		// GIVING VALUES TO 3rd ROW AND COLUMN
		x[2][0]= "A2";
		x[2][1]= "B2";
		x[2][2]= "C2";
		x[2][3]= "D2";
		
		
		
		System.out.println(x[1][2]);
		System.out.println(x[2][3]);


		// using for loop to display everything
		for(int row=0; row<x.length; row++)// have to define "row" for row
		{	
		for(int col=0; col<x[0].length; col++)	// have to define "col" for column
		{
			System.out.println(x[row][col]); }
		}

	}

}
