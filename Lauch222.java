public class Lauch222 
{

	public static void main(String []args) 
	{
		// TODO Auto-generated method stub
         int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i<(n-1)) || (i==n-1 && j>0 && j<3*n/4)  ||  (j==3*n/4 && i<n-1))
				{
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println();
		}
       
	}
}
			
		
	


