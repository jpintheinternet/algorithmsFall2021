package assignmentFive;
import java.util.Scanner;

public class problemTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		double total = 0;
		for(int i = 1; i <= 10000; i++)
		{
			int[] array = generateArray(n);
			
			total += hireCount(array);
		}//end for loop
		
		double avg = total / 10000;
		System.out.print("The average number of hires for 10,000 arrays of " + n + " is " + avg);
		
	}	//end main
	
	public static int[] generateArray (int n)
	{
		//generating ordered array
		int[] array = new int[n]; 
		for(int i = 1; i <= n; i++)
		{
			array[i-1] = i;
		}
		//end ordered array
		
		//randomizing by swap
		for(int i = 0; i < (n-1); i++)
		{
			int temp = array[i];
			int randomIndex = (int)(Math.random()*(n-i)+i);
			
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}
		//end swapping
		
		return array;
	}//end of generateArray
	
	public static int hireCount (int[] array)
	{
		int hireCount = 1;
		int mark = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if (mark > array[i])
			{
				hireCount++;
				mark = array[i];
			}
			
		}//end for loop
		
		return hireCount;
	}//end of hire numbers

}
