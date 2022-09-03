package week3.day2.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> list1 = new LinkedList<Integer>();
		list1 = Arrays.asList(data);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1.get(1));
	}

}
