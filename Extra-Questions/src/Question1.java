import java.util.ArrayList;
import java.util.HashMap;

public class Question1 {

	public static void main(String[] args) {
		 int coinArr[] = {10, 10, 23};

	        int n = coinArr.length;

	        // Using HashMap to store the frequency of each coin
	        HashMap<Integer, Integer> coinCount = new HashMap<>();

	        // Counting the frequency of each coin
	        for (int i = 0; i < n; i++) {
	            if (coinCount.containsKey(coinArr[i])) {
	                coinCount.put(coinArr[i], coinCount.get(coinArr[i]) + 1);
	            } else {
	                coinCount.put(coinArr[i], 1);
	            }
	        }

	        // Checking for the coin that appears an odd number of times
	        for (int coin : coinCount.keySet()) {
	            if (coinCount.get(coin) % 2 == 1) {
	                System.out.println(coin);
	                return;
	            }
	        }

	        System.out.println("No coin is lost!!!");

	}

}
