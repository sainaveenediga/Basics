public class Largest1
{
	public static void main(String[] args)
	{
		int num1=20,num2=30,num3=40;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("num1 is greater "+num1);
			}
			else
			{
				System.out.println("num3 is greater "+num3);
			}
		}
		else{
			if(num2>num3)
			{
				System.out.println("num2 is greater "+num2);
			}
			else{
				System.out.println("num3 is greater "+num3);
			}
		}
	}
}