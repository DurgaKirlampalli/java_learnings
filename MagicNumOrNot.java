class MagicNumOrNot 
{
	public static void main(String[] args) 
	{
	int num=1729;
	int temp=num;
	int sum=0;
	while (num>9)
	{
		while (num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		num=sum;
		sum=0;
	}
		if (num==1)
		{
		System.out.println("Magic Num");
		}
		else 
		{
			System.out.println("not a magic num");
		}
	}
}