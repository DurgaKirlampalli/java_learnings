class FactorialForDigits 
{
	public static void main(String[] args) 
	{
		int num=6666;
		while (num>0)
		{
			int ld=num%10;
			int pro=1;
			for (int i=1;i<=ld ;i++ )
			{
				pro=pro*i;
			}
			System.out.println(pro);
			num=num/10;
			}
		}
	}
