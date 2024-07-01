package week2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - Declare an array 
				int[] arr1 = { 3, 2, 11, 4, 6, 7 };
				int[] arr2 = { 1, 2, 8, 4, 9, 7 };
				List<Integer> list1 = new ArrayList<Integer>();
				List<Integer> list2 = new ArrayList<Integer>();
				for (int array : arr1) {
					list1.add(array);

				}
				for (int array : arr2) {
					list2.add(array);

				}
				System.out.println("The Intersection numbers betweeen 2 arrays are below");
				for (int i = 0; i <= list1.size() - 1; i++) {
					for (int j = 0; j <= list2.size() - 1; j++) {
						if (list1.get(i).equals(list2.get(j))) {
							
							System.out.println(list1.get(i));
						}
					}
				}
	}

}
