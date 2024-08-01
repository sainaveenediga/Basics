public class Discount
{
	public static void main(String[] args)
	{
		int price=1000,quantity=5;
		double total=price*quantity,discount=0;
		if(total<=100)
		{
			discount=10.0/100*total;
		}
		else if(total>200 && total<=300)
		{
			discount=20.0/100*total;
		}
		else if(total>300 && total<=400)
		{
			discount=30.0/100*total;
		}
		else if(total>400 && total<=500)
		{
			discount=40.0/100*total;
		}
		else if(total>500 && total<=600)
		{
			discount=50.0/100*total;
		}
		else
		{
			discount=60.0/100*total;
		}
		System.out.println(discount);
		
	}
}