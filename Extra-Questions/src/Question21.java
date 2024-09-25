import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question21 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,34,56,10,35,24, 10, 34, 56, 34, 10, 24);
		Integer thirdMostFrequent=findThirdMostFrequent(list); 
		System.out.println(thirdMostFrequent);
	}

	public static Integer findThirdMostFrequent(List<Integer> list) {
		Map<Integer,Integer> frequncyMap=new HashMap<>();
		for(Integer element:list)
		{
			frequncyMap.put(element, frequncyMap.getOrDefault(element, 0)+1);
		}
		List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequncyMap.entrySet());

        
        frequencyList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

       
        if (frequencyList.size() < 3) {
            return null;
        }

       
        return frequencyList.get(2).getKey();
	}

}
