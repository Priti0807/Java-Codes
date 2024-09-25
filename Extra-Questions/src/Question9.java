
public class Question9 {

	public static void main(String[] args) {
		int num, k=100;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				num=k-9;
				for(int j=1;j<=10;j++)
				{
					System.out.print(num+" ");
					num++;
					k--;
				}
			}
			else
			{
				for(int j=1;j<=10;j++)
				{
					System.out.print(k+" ");
					k--;
				}
			}
			System.out.println();
		}
	
	

	}

}
