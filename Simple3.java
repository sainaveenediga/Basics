public class Simple3
{
	public static void main(String[] args)
	{
		String name="sai";
		int roll=515,fee=25000,scholarship=0;
		int s1=80,s2=80,s3=89,s4=72;
		double marks=s1+s2+s3+s4;
		double percentage=(marks/400)*100;
		
		if(percentage>80)
		{
			scholarship=10000;
		}
		System.out.println(name);
		System.out.println(roll);
		System.out.println(marks);System.out.println(percentage);
		System.out.println(fee-scholarship);
		
	}
}