//Jean Paul Espinosa
//CS3112 Algorithms
//8/30/2021

package problemOne;
import java.util.Scanner;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		//For a given positive integer 'i', output the first n primes
		//n = 3, output: 2,3,5
		
		//new Scanner object
		Scanner input = new Scanner(System.in);
		//prompt for "n = "
		System.out.print("Enter an integer for n: ");
		int n = input.nextInt();

		int counter = 0;
		int count = 0;
		
		//calculating primes
		System.out.print("output: ");
		for(int i = 2; counter < n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count < 3)
			{
				counter++;
				if(counter < n)
				{
					System.out.print(i + ", ");
				}
				else
				{
					System.out.print(i + ".");
				}
			}
			count = 0;
				
		}
		
	}

}
