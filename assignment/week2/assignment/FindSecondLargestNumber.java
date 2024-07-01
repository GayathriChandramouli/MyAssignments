package week2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumber {
	
	public static void main(String[] args) {
		int[] array={3, 2, 11, 4, 6, 7};
		Arrays.sort(array);
		List<Integer> ls=new ArrayList<Integer>();
		
		for(int arr1:array) {
			ls.add(arr1);
		}
		int size=ls.size();
		System.out.println(ls.get(size-2));
	}


}
