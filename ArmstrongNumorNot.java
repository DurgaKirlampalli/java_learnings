class ArmstrongNumorNot 
{
	public static void main(String[] args) 
	{
		int num=153;
		int temp=num;
		int count=0;
		int sum=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		while (num>0)
		{
			int ld=num%10;
			int exp=1;
			for (int i=1;i<=count ;i++ )
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			num=num/10;
		}
			if (sum==temp)
			{
				System.out.println("given num is armstrong num");
			}
			else 
			{
				System.out.println("given num is not armstrong num");
			}

	}
}