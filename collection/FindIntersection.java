package week3.day2.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		Integer arr1[] = {3,2,11,4,6,7};
		Integer arr2[] = {1,2,8,4,9,7};
		
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1 = Arrays.asList(arr1);
		list2 = Arrays.asList(arr2);
		first: for (Integer integer : list1) {
			for (Integer integer2 : list2) {
				if(integer == integer2) {
					System.out.println(integer);
					break first;
				}
			}
			
		}
	}

}
