//Write a Java program to display the pattern like right angle triangle with a number. 

import java.util.Scanner;
class pattern
{
	public static void main(String[] args) {
		int i,j,number;
		System.out.println("enter number :- ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for(i=1;i<=number;i++)
		{
			for (j=1;j<=i;j++) 
			{
				System.out.println(j);
			}
			System.out.println("");

		}

	}
}