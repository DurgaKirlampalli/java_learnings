import java.util.Scanner;
class OddDigitsInNum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Digits");
		int num=scan.nextInt();
		int i=num;
			while (num>0)
			{
			int ld = num%10;
			num =num/10;
			}
			if (i%2!=0)
			{
				System.out.println("Digits is ODD");
			}
			else 
		{
				System.out.println("Digists is NOt ODd");
		}
	}
}