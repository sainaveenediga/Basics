public class Diamond
{
	public static void main(String[] args)
	{
		System.out.println("helllo");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}