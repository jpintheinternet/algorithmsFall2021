package assignmentThree;
import java.util.Scanner;

public class problemTwo {

	public static void main(String[] args) {
		//implement binary search on a sorted tree
		
		int length = 10;
		int[] sortedArray = new int [length];
		for(int i = 0; i < sortedArray.length; i++)
		{
			sortedArray[i] = i * 2;
		}
		//output merge sorted array
		System.out.print("Sorted Array: ");
		for(int i = 0; i < sortedArray.length;i++)
		{
			System.out.print(sortedArray[i]);
			if(i == sortedArray.length - 1)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of sorted array output
		
		//request findNum
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to search: ");
		int findNum = input.nextInt();
		System.out.println();
		
		//call binary search
		int indexZero = 0;
		System.out.println(("The number ") + findNum 
				+ (" can be found in this position: ") 
				+ binarySearch(sortedArray, indexZero, findNum, sortedArray.length - 1));
		
	}//end of main
	
	//binary search
	private static int binarySearch(int[] array, int indexStart, int numFind, int indexEnd)
	{
		int indexHalf = indexEnd / 2;
		int foundIndex = 0;
		if (array[indexHalf] == numFind)
		{
			foundIndex = indexHalf;
		}
		else if (array[indexHalf] < numFind)
		{
			binarySearch(array, indexStart, numFind, indexHalf);
		}
		else
		{
			binarySearch(array, indexHalf + 1, numFind, indexEnd);
		}
		
		return foundIndex;
	}//end of binary search

}
