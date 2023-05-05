package assignmentFive;
import java.util.Scanner;

public class problemOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		System.out.println();
		
		//for loop calculation
		double total = 0;
		for (double i = 1; i <= n; i++)
		{
			total = total + (1/i);
		}
		//end for loop
		
		//output
		System.out.printf("The summation from i=1 to n when (1/i) is %f", total);
		//end of output
		
	}	//end of main

}
