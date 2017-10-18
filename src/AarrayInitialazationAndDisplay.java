package com.pioneercoders.arrays;

public class AarrayInitialazationAndDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {12,6,14,23};
		
		// ****** print the array elements using index *******
		
		System.out.println(" Element at index 1 ["+array[1]+"]");
		
		System.out.println(" Element at index 2 ["+array[2]+"]");
		
		
		// ****** array index start with 0 and ends with leangth-1 so in this case last index is 3
		//we are trying 4 index which is not there so we are getting java.lang.ArrayIndexOutOfBoundsException: 4 *******
		System.out.println(" Element at index 4 ["+array[4]+"]");
		
		
		
	}

}
