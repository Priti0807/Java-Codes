
public class Question7 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=1;j--)
			{
				if(i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
