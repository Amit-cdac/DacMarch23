public class pattern_16 

/*

5
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1

*/

{
	public static void main (String[] args)
	{
		for(int a=5; a>=1; a--)
		{
			for(int b=5; b>=a; b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
