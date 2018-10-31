/*
Zach Miller
Assignment 5.2
The purpose of this program is to print the square root of even numbers between 0 and 20 in a table-like format
26 Sept 2017
Bellevue University
SquareRootTable.java
*/
public class SquareRootTable {

	public static void main(String[] args) {
		 print();
	}
	
	private static void print()
	{
		String number="Number",sqrt="Square Root";
		System.out.printf("%2s %10s" ,number, sqrt);
		
		for(int i=0;i<=20;i+=2)
		{
			System.out.print("\n");
			System.out.printf("%-2s %10.4f",  i, Math.sqrt(i));
			
		}
		
	}

}
