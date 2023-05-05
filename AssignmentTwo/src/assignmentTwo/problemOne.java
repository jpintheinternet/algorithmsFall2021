//Jean Paul Espinosa
//CS3112-01
//09/13/2021

package assignmentTwo;
import java.util.Random;
import java.util.Scanner;

public class problemOne {

	public static void main(String[] args) {
		//have program generate a random array
		//output original random array
		//output sorted array, sorted by selection sort
		
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
		
		//selection sort
		int indexMark = 0;
		int temp = 0;
		for( int i = 0; i < n-1; i++)
		{
			indexMark = i;
			for(int j = (i + 1); j < n; j++)
			{
				if(randomArray[indexMark] > randomArray[j])
				{
					indexMark = j;
				}
				
			}//end of inner loop
			
			//swap
			temp = randomArray[indexMark];
			randomArray[indexMark] = randomArray[i];
			randomArray[i] = temp;
			//end of swap
			
		}//end of outer loop
		//end of selection sort
		
		//output sorted array
		System.out.println();
		System.out.print("Selection Sorted Array: ");
		for(int i = 0; i < n; i++)
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
