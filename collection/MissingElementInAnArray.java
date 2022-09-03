package week3.day2.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		Integer [] arr= {5,2,3,4,7,1,8};
		List<Integer> list1 = new LinkedList<Integer>();
		list1 = Arrays.asList(arr);
		//Collections.sort(list1, Collections.reverseOrder());
        for(int i = 0; i < list1.size(); i++) {
            if(i !=list1.get(i)){
            	System.out.println(list1.get(i));
            	break;
            }
        	
        }

	}

}
