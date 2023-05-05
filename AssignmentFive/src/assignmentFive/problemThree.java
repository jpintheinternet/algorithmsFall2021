//Jean Paul Espinosa
//CS3112-01
//11/29/2021

package assignmentFive;

import java.util.Scanner;

public class problemThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		System.out.println();
		
		int[] array = new int[n];
		for(int i = 1; i <= n; i++)
		{
			array[i-1] = i;
		}
		
		int totalHires = 0;
		totalHires = printRecursive(n,array, totalHires);
		System.out.print("\nTotal hires is " + totalHires);
		
		double avgHires = totalHires / (numFactorial(n));
		System.out.print("\nThe average number of hires is " + avgHires);
		
	}//end of main
	
	public static int printRecursive(int n, int[] array, int totalHires)
	{
		if (n == 1)
		{
			totalHires = arrayPrint(array, totalHires);
		}
		else
		{
			for(int i = 0; i < (n-1); i++)
			{
				totalHires = printRecursive(n-1, array,totalHires);
				
				if ((n % 2) == 0)
				{
					swap(array, i, n-1);
				}
				else
				{
					swap(array, 0, n-1);
				}
			}
			totalHires = printRecursive(n-1, array, totalHires);
		}
		
		return totalHires;
	}//end of printRecursive
	
	public static void swap (int[] array, int indexA, int indexB)
	{
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	public static int arrayPrint (int[] array, int totalHires)
	{
		System.out.println();
		for(int i = 0; i < array.length; i++)
		{
			if (i == (array.length - 1))
			{
				System.out.print(array[i]);
			}
			else
			{
				System.out.print(array[i] + ", ");
			}
		}
		
		int hireNum = hireCount(array);
		totalHires += hireNum;
		System.out.print(" - " + hireNum + " hires");
		
		return totalHires;
	}//end arrayPrint
	
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
	
	public static double numFactorial(int n)
	{
		double factorial = 1;
		for(int i = 1; i <= n; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.print("\nFactorial of " + n + " is " + factorial);
		return factorial;
	}

}
