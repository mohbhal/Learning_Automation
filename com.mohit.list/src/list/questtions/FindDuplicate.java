package list.questtions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "B", "C", "D", "D", "Z", "E", "E","E","E");
		list.forEach(res -> System.out.println(res));
		List<String> res1 = list
				.stream().
				filter(entry -> Collections.frequency(list, entry) > 1)
				.distinct()

				.collect(Collectors.toList());
		System.out.println(res1);

		/*
		 * for (int i = 0; i < nums.length-1; i++) {
		 * 
		 * if (nums[i] == nums[i+1]) {
		 * System.out.println("duplicate item "+nums[i+1]+" at Location"+(i+1) ); }
		 * 
		 * }
		 */ }

}
