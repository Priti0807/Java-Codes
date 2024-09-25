
public class Question10 {

	public static void main(String[] args) {
		String msg="I belong to Firstbit";
		System.out.println("Original String \n"+msg);
		String[]arr=msg.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(" "+arr[i]);
		}
		
		
	}

}
