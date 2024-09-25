import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
      
        String[] words = sentence.split("\\s+");
        
        System.out.println("Words starting with 's':");
        for (String word : words) 
        {
            if (word.toLowerCase().startsWith("s")) 
            {
                System.out.println(word);
            }
        }
    }

}
