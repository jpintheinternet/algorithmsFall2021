package assignmentFive;

import java.util.Scanner;

public class problemFour {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int n = input.nextInt();
	
	double lnOfN = Math.log(n);
	System.out.print("\nThe natural log of " + n + " is "+ lnOfN);
	}//end of main

}
