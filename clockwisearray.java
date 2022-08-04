//Write a Java program to cyclically rotate a given array clockwise by one.

class clockwisearray
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};

		for(int i=0;i<a.length;i++)
		{
			System.out.println(+a[i]);
		}
		System.out.println("reverse element is :- ");
	
		 for(int i=a.length-1;i>=0;i--)
		 {
		 	System.out.println(+a[i]);
		 }
	}
}