//Jean Paul Espinosa
//CS3112-01
//09/13/2021

package assignmentTwo;
import java.util.Random;
import java.util.Scanner;

public class problemTwo {

	public static void main(String[] args) {
		//generate a random array
		//output original random array
		//output sorted array, insertion sort
		
		Scanner input = new Scanner(System.in);
		//prompt for "n = "
		System.out.print("Enter the length of the array: ");
		int n = input.nextInt();
		
		int[] randomArray = new int[n];
		Random rand = new Random();
		
		//create random array
		for( int i = 0; i < n; i++)
		{
			randomArray[i] = rand.nextInt(500);
		}
		
		//output original array
		System.out.print("Original Unsorted Array: ");
		for(int i = 0; i < n;i++)
		{
			System.out.print(randomArray[i]);
			if(i == n-1)
			{
				System.out.print(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of original output
		
		//insertion sort
		int indexMark = 1;
		int temp = 0;
		for(int i = 1; i < n; i++)
		{
			if(randomArray[i] < randomArray[i-1])
			{
				indexMark = i;
				while((indexMark > 0) && (randomArray[indexMark] < randomArray[indexMark - 1]))
				{
					//swap
					temp = randomArray[indexMark];
					randomArray[indexMark] = randomArray[indexMark - 1];
					randomArray[indexMark - 1] = temp;
					//end of swap
					indexMark--;
				}//end of inner loop
			}
			
		}//end of outer loop
		//end of insertion sort
		
		//output sorted array
		System.out.println();
		System.out.print("Insertion Sorted Array: ");
		for(int i = 0; i < n;i++)
		{
			System.out.print(randomArray[i]);
			if(i == n-1)
			{
				System.out.print(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of sorted output
		
	}//end of main

}
