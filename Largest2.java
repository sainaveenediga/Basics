public class Largest2
{
	public static void main(String[] args)
	{
		int num1=20,num2=30,num3=40;
		String result=(num1>num2)?((num1>num3)?("num1 is greater"+num1):("num1 is greater"+num1)):((num2>num3)?("num2 is greater"+num2):("num3 is greater"+num3));
		System.out.println(result);
	}
	
	
}