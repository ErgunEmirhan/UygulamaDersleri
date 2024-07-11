package week03.day03;

import java.util.Arrays;

public class q2Cursed {
	/*
	2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
başka bir diziye atsın ve o diziyi yazdırsın.
	 */
	
	// ?
	public static void main(String[] args) {
	int[] ar = printOdd(3, 5, 6, 1, 2, 6, 343,7 ,14, 124);
	}
	
	
	public static int[] printOdd(int... numbers){
		int[] oddArr = new int[numbers.length];
		int count = 0;
		for (int number: numbers){
			if (number % 2 == 1) {
				oddArr[count] = number;
				count++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(oddArr, 0, count)));
		return oddArr;
	}
}