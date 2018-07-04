import java.util.Scanner;

public class pattern {
	public static void main(String [] agrs){
		System.out.println("Enter the number of rows");
		@SuppressWarnings("resource")
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();

/*      * 
		** 
		*** 
		**** 
		*****     */
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}

		
		
		
//			for(int i=1;i<=n;i++)
//			{
//				for (int k=1;k<=n-i;k++)
//				{
//					System.out.print(" " );
//				}
//				for(int j=1;j<=2*i-1;j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println(" ");
//			}
//		
//		for(int i=n;i>=1;i--)
//		{
//			for (int k=n-i;k>=1;k--)
//			{
//				System.out.print(" " );
//			}
//			for(int j=2*i-1;j>=1;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
		
		
//			for (int i =1;i<=n;i++)
//			{
//				for(int j=i;j<=n;j++)
//				{
//					System.out.print("*");
//				}
		// System.out.println(" ");
		//	}

		//	for(int i=1; i<=n;i++)
		//	{
		//		for(int j=n;j>=i;j--)
		//		{
		//			System.out.print("*");
		//		}
		//		System.out.println(" ");
		//	}
//		int k;
//		for(int i=4; i>=0;i--)
//		{
//			
//			
//			for(k=i;k>0;k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=4-i;j>=0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			
//		}





	}}