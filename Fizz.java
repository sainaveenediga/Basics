public class Fizz
{
	public static void main(String[] args)
	{
		int num=30;
		{
			if(num%5==0 && num%3==0)
			{
				System.out.print("FIZZ buzz");
			}
			else if(num%5==0)
			{
				System.out.print("FIZZ");
			}
			else if(num%3==0)
			{
				System.out.print("buzz");
			}
			else{
				System.out.print("invalid ");
			}
		}
	}
}