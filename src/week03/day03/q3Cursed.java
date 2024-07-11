package week03.day03;

import java.util.Arrays;

public class q3Cursed {
	/*
	3- int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
Yukarıdaki 2 boyutlu array'i tek boyutlu bir array olarak yazdıran metot.
	 */
	
	// ?
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
				33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
		
		printArray(matris);
	}
	
	public static int[] printArray(int[][] matrix){
		int lastLength = 0, lastIndex = 0;
		for (int i = 0; i < matrix.length; i++) lastLength += matrix[i].length;
		
		int[] lastArray = new int[lastLength];
		for (int[] subArray: matrix){
			for (int number: subArray){
				lastArray[lastIndex] = number;
				lastIndex++;
			}
		}
		
		System.out.println(Arrays.toString(lastArray));
		return lastArray;
	}
}