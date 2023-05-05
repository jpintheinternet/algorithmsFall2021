package assignmentFour;

public class problemTwo {

	public static void main(String[] args) {
		/*Implement the divide-and-conquer algorithm of maximum 
		subarray introduced in Chapter 4. */
		
		int indexStart = 0;
		int n = 10;
		int indexEnd = n -1;
		
		//create random array
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
			if(i == n - 1)
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}//end of random array output
		
		//implement divide-and-conquer
		int[] result = findMaxSubArray(randomArray, indexStart, indexEnd);	//(low, high, sum)
		
		//output result
		System.out.print("The Maximum Subarray is from indices " + result[0] + " and " + result[1] + ": ");
		for(int i = result[0]; i <= result[1]; i++)
		{
			System.out.print(randomArray[i]);
			if(i == result[1])
			{
				System.out.println(".");
			}
			else
			{
				System.out.print(", ");
			}
		}
		System.out.print("\nThe sum of the Maximum Subarray is " + result[2] + ".");
		//end output
		
	}//end of main
	
	public static int[] findMaxCrossSubArray(int[] array, int low, int mid, int high)
	{
		//initialize return variables
		int maxLeft = 0;
		int maxRight = 0;
		
		//find a max subarray from array[low...mid]
		int leftSum = -1000;
		int sum = 0;
		for(int i = mid; i >= low; i--)
		{
			sum += array[i];
			if(sum > leftSum)
			{
				leftSum = sum;
				maxLeft = i;
			}
		}
		
		//find a max subarray from array[mid+1...high]
		int rightSum = -1000;
		sum = 0;
		for(int j = mid+1; j <= high; j++)
		{
			sum += array[j];
			if(sum > rightSum)
			{
				rightSum = sum;
				maxRight = j;
			}
		}
		
		//return indices and sum of the two subarrays
		int[] ans = new int[3];
		ans[0] = maxLeft;
		ans[1] = maxRight;
		ans[2] = leftSum + rightSum;
		
		return ans;
	}//end of findMaxCrossSubArray
	
	public static int[] findMaxSubArray(int[] array, int low, int high)
	{
		int[] ans = new int[3];
		
		if(high == low)	//base case, one element
		{
			ans[0] = low;
			ans[1] = high;
			ans[2] = array[low];
		}
		else
		{
			int mid = (low + high) / 2;
			int[] subLeft = findMaxSubArray(array, low, mid);		//(leftLow, leftHigh, leftSum)
			int[] subRight = findMaxSubArray(array, mid + 1, high);		//(rightLow, rightHigh, rightSum)
			int[] subCross = findMaxCrossSubArray(array, low, mid, high);	//(crossLow, crossHigh, crossSum)
			if ((subLeft[2] > subRight[2]) && (subLeft[2] > subCross[2]))
			{
				ans[0] = subLeft[0];
				ans[1] = subLeft[1];
				ans[2] = subLeft[2];
			}
			else if ((subRight[2] > subLeft[2]) && (subRight[2] > subCross[2]))
			{
				ans[0] = subRight[0];
				ans[1] = subRight[1];
				ans[2] = subRight[2];
			}
			else
			{
				ans[0] = subCross[0];
				ans[1] = subCross[1];
				ans[2] = subCross[2];
			}
			
		}//end of outer else
		
		return ans;
	}

}
