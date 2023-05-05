//Jean Paul Espinosa
//CS3112-01
//08/30/2021

package problemTwo;
import java.util.Scanner;

public class primeCeiling {

	public static void main(String[] args) {
		//For a given integer n>1, list all primes not exceeding n
		//n = 10, output: 2, 3, 5, 7
		
		//new Scanner object
		Scanner input = new Scanner(System.in);
		//prompt for "n = "
		System.out.print("Enter an integer for n: ");
		int n = input.nextInt();
		
		int[] primeArray = new int[n-1];
		int sqrt = (int) Math.sqrt(n);
		for (int i = 0; i < (n-1); i++)
		{
			primeArray[i] = (i + 2);
		}
		
		//first output
		for(int m = 0; m < n-1; m++)
		{
			System.out.print(primeArray[m] + " ");
		}
		System.out.println();
		
		//prime calculations
		for (int i = 2; i <= sqrt; i++)
		{
			if(primeArray[i] != 0)
			{
				for( int j = (i * i); j <= (n); j +=i)
				{
					primeArray[j-2] = 0;
				}
				
				//final output
				for(int m = 0; m < n-1; m++)
				{
					if(primeArray[m] != 0)
					{
						System.out.print(primeArray[m] + " ");
					}
					else	//space formatting
					{
						System.out.print("  ");
						if(m > 7)
						{
							System.out.print(" ");
						}
					}
				}//end of output
				System.out.println();
			}
		}//end of prime calculations
		
		//counting # of primes
		int counter = 0;
		for (int i = 0; i < (n-1); i++)
		{
			if(primeArray[i] != 0)
			{
				counter++;
			}
		}
		
		//copy remaining elements to outputArray
		int[] outputArray = new int[counter];
		int newIndex = 0;
		for (int i = 0; i < (n-1); i++)
		{
			if(primeArray[i] != 0)
			{
				outputArray[newIndex] = primeArray[i];
				newIndex++;
			}
		}
		//Output for new ouputArray
		System.out.print("Output: ");
		for(int m = 0; m <= (newIndex - 1); m++)
		{
			System.out.print(outputArray[m]);
			if(m < (newIndex - 1))
			{
				System.out.print(", ");
			}
			else
			{
				System.out.print(".");
			}
		}
		
	}

}
