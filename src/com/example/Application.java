package com.example;

public class Application {

	public static void main(String[] args) {
		// create a new array
		int[][] array = new int[5][3];

		// initialize the array with zero
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}

		// printing initial array
		System.out.println("Array before changing:");
		System.out.println("------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		int steps = (int) (Math.random() * 3 + 3);
		System.out.println("------------------------");
		System.out.println("Should replace " + steps + " items");
		System.out.println("------------------------");

		// changing elements of array
		for (int i = 0; i < steps; i++) {
			int row = (int) (Math.random() * 5);
			int col = (int) (Math.random() * 3);
			
			// check that the element is modified, if it is true, repeat the step again
			if (array[row][col] != 1) {
				array[row][col] = 1;
			} else {
				i--;
			}
		}

		// print modified array
		System.out.println("Array after changing:");
		System.out.println("------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------");

	}

}
