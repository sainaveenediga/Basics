public class Eligible
{
	public static void main(String[] args)
	{
		String qualification="mca",skills="java",exam="pass";
		double percentage=75;
		int year=2023,fee=25000,discount=10000;
	if((qualification=="mca"||qualification=="btech"||qualification=="diploma")&&(percentage>=60)&&(skills=="c"||skills=="java"||skills
	=="python")&&(exam=="pass"))
	{
		System.out.println("eligible ");
		fee=fee-discount;
	}
	else
	{
		System.out.println("not eligible ");
		fee=fee;
	}
		System.out.println(fee);
	}
}