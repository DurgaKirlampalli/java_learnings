class PrintGivenNumWhileLoop 
{
	public static void main(String[] args) 
	{
		int num=3561;
		while (num>0)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
	}
}
