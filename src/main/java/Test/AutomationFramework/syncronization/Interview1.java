package Test.AutomationFramework.syncronization;

import java.util.HashMap;
import java.util.Map;

public class Interview1 {

	public static void main(String[] args) {

		String[] array = { "Branch1", "Branch2", "Branch3", "Branch4", "Branch5", "Branch6", "Branch3", "Branch2",
				"Branch2" };

		HashMap<String, Integer> map = new HashMap<>();

		for (String branch : array) {
			if (map.containsKey(branch)) {
				map.put(branch, map.get(branch) + 1);
			} else {
				map.put(branch, 1);
			}
		}
		int value = 0;
		String key = null;
		for (Map.Entry<String, Integer> data : map.entrySet()) {
			if (data.getValue() > value) {
				value = data.getValue();
				key = data.getKey();

			}
			
		}
		
		
		System.out.println("Highest repeated branch is ::" + key + " " + value);
	}

}
