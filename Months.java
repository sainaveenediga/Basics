public class Months
{
	public static void main(String[] args)
	{
		String month="january";
		int year=2000;
		if(month=="january"||month=="march"||month=="may"||month=="july"||month=="august"||month=="october"||month=="december")
		{
			System.out.print("31 days ");
		}
		else if(month=="february")
		{
			if((year%4==0 || year%100!=0)&&(year%400==0))
			{
				System.out.print("29 days");
			}
			else
			{
				System.out.print("28 days");
			}
		}
		else
		{
			System.out.print("30 days");
		}
	}
}