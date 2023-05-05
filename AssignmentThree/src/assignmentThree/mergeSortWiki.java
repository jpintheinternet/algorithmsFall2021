package assignmentThree;

import java.util.Random;

public class mergeSortWiki {

	public static void main(String[] args) {
		//implement the merge sort
		//Ch2 slide 16
		
		//create random array
		int n =10;
		int[] randomArray = new int[n  + 1];
		int[] copyArray = new int[n + 1];
		Random rand = new Random();
		
		for( int i = 0; i < n; i++)
		{
			randomArray[i] = rand.nextInt(50);
		}
		//end of array creation
		
		//output original array
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < n; i++)
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
		
		//call merge sort------------------------------
		//int indexZero = 0;
		//mergeSortAlg(randomArray, indexZero, (n - 1));
		int upperRange = n +1;
		mergeSortAlgorithm(randomArray, copyArray, n);
		//end of merge call------------------------------
		
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
		
	}//end of main
	
	/*/merge sort algorithm
	private static void mergeSortAlg (int[] array, int p, int r)
	{
		if(p + 1 < r)
		{
			int q = (p + r) / 2;
			mergeSortAlg(array, p, q);
			mergeSortAlg(array, q + 1, r);
			mergeSortProc(array, p, q, r);
		}
	}
	//end of merge algorithm
	
	//merge sort procedure
	private static void mergeSortProc (int[] array, int p, int q, int r)
	{
		int num1 = q - p;
		int num2 = r - q + 1;
		int[] leftArray = new int[num1 + 1];
		int[] rightArray = new int[num2 + 1];
		for(int i = 0; i < num1; i++)
		{
			leftArray[i] = array[p + i];
		}
		for(int j = 0; j < num2; j++)
		{
			rightArray[j] = array[q + j];
		}
		leftArray[num1] = 1000;
		rightArray[num2] = 1000;
		int i = 0;
		int j = 0;
		for(int k = p; k < r; k++)
		{
			if (leftArray[i] <= rightArray[j])
			{
				array[k] = leftArray[i];
				i += 1;
			}
			else
			{
				array[k] = rightArray[j];
				j += 1;
			}		
		}
		
	}//end of merge sort procedure*/
	
	//new merge sort from wiki---------------------------
	
	
	private static void mergeSortAlgorithm(int[] originalArray, int [] copyArray, int aUpper)
	{
		arrayCopy(originalArray, 0, aUpper, copyArray);
		
		//mergeSplit
		mergeSplit(copyArray, originalArray, 0 , aUpper);
	}
	
	private static void mergeSplit(int[] originalArray, int[] copyArray, int aLower, int aUpper)
	{
		if(aUpper - aLower <= 1)
		{
			return;
		}
		int aMiddle = (aUpper + aLower) / 2;
		
		mergeSplit(originalArray, copyArray, aLower, aMiddle);
		mergeSplit(originalArray, copyArray, aMiddle, aUpper);
		mergeProcedure(copyArray, aLower, aMiddle, aUpper, originalArray);
	}
	
	private static void mergeProcedure(int[] originalArray, int aLower, int aMiddle, int aUpper, int[] copyArray)
	{
		int m = aLower;
		int n = aUpper;
		
		for(int o = aLower; o < aUpper; o++)
		{
			if((m < aMiddle) && (n >= aUpper - 1 || originalArray[m] <= originalArray[n]))
			{
				copyArray[o] = originalArray[m];
				m += 1;
			}
			else
			{
				copyArray[m] = originalArray[n];
				n += 1;
			}
		}
	}
	private static void arrayCopy(int[] originalArray, int aLower, int aUpper, int[] copyArray)
	{
		for(int i = aLower; i < aUpper; i++)
		{
			copyArray[i] = originalArray[i];
		}
	}
	//end of new merge sort------------------------------

}
