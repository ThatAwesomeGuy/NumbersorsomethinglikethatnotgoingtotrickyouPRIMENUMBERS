// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

 
public class MathLab04st
{
	public static void main(String args[]) 
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in); 
		System.out.println("\nMathLab04\n");
		final int MAX = 1000;
		boolean primes[];
		primes = new boolean[MAX];
		computeanddisplayPrimes(primes);
		
	}

	public static void computeanddisplayPrimes(boolean primes[])
	{
		System.out.print("Enter the primes upper bound  ===>>  ");
		Scanner input = new Scanner(System.in); 
		String n = input.next();
		
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		ArrayList<Integer> primelist = new ArrayList<Integer>();
		 DecimalFormat Hello  = new DecimalFormat("#0000");
		
	
	
		for(int i=1;i < Integer.parseInt(n); i++)
		{
			boolean primes1=true;
			
			for(int y=2; y < i; y++)
			{
				if(i%y==0) //if remainder is 0
				{
					primes1= false;
					break;
				}
			}
			if(primes1 && i != 1) //if prime and not 1 add it to list
				{
				primelist.add(i);
				}
			}
		
  		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ n);  	
  		
  	
  		System.out.println(""+primelist);
		}

	
}




