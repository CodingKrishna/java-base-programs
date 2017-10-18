package com.pioneercoders.arrays;

import java.util.Scanner;

public class DeleteElementInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size:: ");
		int size = scanner.nextInt();
		int userArray[] = new int[size];

		// Dynamically reading array elements from console 
		for (int index = 0; index < userArray.length; index++) {
			System.out.println("Enter the array element");
			userArray[index] = scanner.nextInt();
		}
		
		// Display array which we captured..

		for (int element: userArray) {
			System.out.print("Elements in User Array:: "+element);
		}
		
		System.out.println("Which element u want to delete?");
		int elementToDelete = scanner.nextInt();
		int tempArray[] = new int[size];
		for (int j = 0; j < userArray.length; j++) {

			if (j == (n - 1)) {
				continue;
			}

			brr[j] = arr[j];
			System.out.println(brr[j]);
		}

	}
}
