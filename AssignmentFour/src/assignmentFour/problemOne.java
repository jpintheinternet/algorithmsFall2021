package assignmentFour;

public class problemOne {

	public static void main(String[] args) {
		//implement a brute force algorithm to find the maximum subarray
		
		
		//create random array
		int n = 10;
		int[] randomArray = new int[n];
		int a = (-20);
		int b = 20;
		for(int i = 0; i < n; i++)
		{
			randomArray[i] = (int)(Math.random()*(b-a)+a);
		}//end of random array creation
		
		//output random array
		System.out.print("Random Array: ");
		for(int i = 0; i < randomArray.length; i++)
		{
			System.out.print(randomArray[i]);
			if(i == randomArray.length - 1)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of random array output
		
		//finding maximum-subarray
		int maxSub = 0;
		int subStart = 0;
		int subEnd = 0;
		for(int i = 0; i < randomArray.length; i++)
		{
			int subSum = 0;
			for(int j = i; j < randomArray.length; j++)
			{
				subSum += randomArray[j];
				if(subSum > maxSub)
				{
					maxSub = subSum;
					subStart = i;
					subEnd = j;
				}
			}//end inner
		}//end outer
		
		//output maximum array
		System.out.print("\nMaximum Subarray: ");
		for (int i = subStart; i <= subEnd; i++)
		{
			System.out.print(randomArray[i]);
			if(i == subEnd)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}
		
		//output sum of maximum array
		System.out.print("The sum of maximum subarray is " + maxSub 
				+ " and happens inside indexes " 
				+ subStart + " and " + subEnd + ".");
		
		
	}//end of main

}
