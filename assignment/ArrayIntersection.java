package week1.assignment;

import java.util.Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println("Common number between 2 arrays are");
		
		for (int i = 0; i < array1.length; i++) { 
			
			for (int j = 0; j < array2.length; j++) {
				
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			
				
			}
			
				
			}
		
	}

}
