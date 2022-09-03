package week3.day2.collection;

import java.util.LinkedHashSet;
import java.util.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
        int count=0;
        String[] split=text.split(" ");
        Set<String>unique=new LinkedHashSet<String>();
        for (int i=0; i<split.length; i++) {
        unique.add(split[i]);
        }
        System.out.println(unique);
        String newText =  "";
        for (String string : unique) {
			newText = newText+" "+string;
		}
        System.out.println(newText);
	}

}
