public class Square1
{
	public static void main(String[] args)
	{
		int num1=2;
		double num2=Math.sqrt(num1);
		if(num1%num2==0)
		{
			System.out.print("its a perfect square "+num2);
		}
		else
		{
			System.out.print("its not a perfect square "+num2);
		}
	}
}