package week1.assignment;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,4,5,2,8,6,7};
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			 
			if(array[i] != i+1) {
				System.out.println(i+1);
				break;
			}
			
		}
	}

}
