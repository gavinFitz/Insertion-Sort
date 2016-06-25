import java.util.*;
public class insertion
{
	public static void main (String args[])
	{
		int ar[] = new int[5];
		Scanner sc1 = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			ar[i] = sc1.nextInt();
		}

		for(int outer = 1; outer < ar.length;outer++)
		{
			int temp = ar[outer];
			int inner = outer;
			while(inner>0 && ar[inner-1] >= temp)
			{
				ar[inner] = ar[inner-1];
				inner--;
			}
			ar[inner] = temp;
		}

		for(int x = 0; x < 5; x++)
		{
			System.out.println(ar[x]);
		}
	}
}