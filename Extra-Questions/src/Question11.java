
public class Question11 {

	public static void main(String[] args) {
		
		int arr[]= {4,-5,9,11,25,13,12,8};
		int number=20;
		sumOfElemets(arr,number);
	}

	public static void sumOfElemets(int[] arr, int number) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{
					System.out.println(arr[i]+"+"+arr[j]+"="+number);
				}
			}
		}
	}

}
