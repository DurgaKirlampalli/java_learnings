import java.util.Scanner;
class TrainglePattern4 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row Value");
		int row=scan.nextInt();
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=row ;j++ )
			{
				if (i<=j)
				{
					System.out.print(" * ");
				}
				else  
				{
					System.out.print("   ");
				}
			}
		System.out.println();
		}
	}
}