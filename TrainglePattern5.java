import java.util.Scanner;
class TrainglePattern5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row value");
		int row=scan.nextInt();
		int num=1;
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=row ;j++ )
			{
				if(i<=j)
				{
					System.out.print(num+"\t");
					num++;
			}
				else
			{
					System.out.print(" \t");
			}
		}
		System.out.println();
	}
}
}