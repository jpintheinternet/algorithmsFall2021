package assignmentThree;
import java.util.Scanner;
import java.util.Random;

public class mergeAndBinarySearch {

	public static void main(String[] args) {
		
		//create random array
		int n =10;
		int[] randomArray = new int[n];
		Random rand = new Random();
		
		for( int i = 0; i < n; i++)
		{
			randomArray[i] = rand.nextInt(50);
		}
		//end of array creation
		
		//output original array
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < randomArray.length;i++)
		{
			System.out.print(randomArray[i]);
			if(i == n - 1)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of original output
		System.out.println("Array length: " + n);
		
		//call merge sort---------------------------------------------
		
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
		
		//end merge call----------------------------------------------
		
		//output merge sorted array
		System.out.print("Sorted Array: ");
		for(int i = 0; i < randomArray.length;i++)
		{
			System.out.print(randomArray[i]);
			if(i == n - 1)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of sorted array output
		System.out.println(randomArray.length);
		
		//request findNum
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to search: ");
		int findNum = input.nextInt();
		System.out.println();
		//request for findNum = 4th index !!!!!!!!!!!!!
		
		//call binary search
		int indexZero = 0;
		System.out.println(("The number ") + findNum 
				+ (" can be found in this position: ") 
				+ binarySearch(randomArray, indexZero, findNum, randomArray.length - 1));
		
		
		
	}//end of main
	
	//binary search
	private static int binarySearch(int[] array, int indexStart, int numFind, int indexEnd)
	{
		int indexHalf = (indexStart + indexEnd) / 2;
		int foundIndex = 0;

		if (array[indexHalf] > numFind)
		{
			foundIndex = binarySearch(array, indexStart, numFind, indexHalf);
		}
		else if (array[indexHalf] < numFind)
		{
			foundIndex = binarySearch(array, indexHalf + 1, numFind, indexEnd);
		}
		else
		{
			foundIndex = indexHalf;
		}
		
		return foundIndex;
	}//end of binary search

}
