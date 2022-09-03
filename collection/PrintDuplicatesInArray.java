package week3.day2.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list1 = new LinkedList<Integer>();
		 Set<Integer> checkSet=new LinkedHashSet<Integer>();
		 list1 = Arrays.asList(arr);
		 Set<Integer> targetSet=new LinkedHashSet<Integer>();
		 for (Integer integer : list1) {
			if(!checkSet.add(integer)) {
				targetSet.add(integer);
			}
		}
		System.out.println(targetSet);
					
			}

}
