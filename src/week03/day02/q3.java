package week03.day02;

import java.util.Arrays;
import java.util.List;

public class q3 {
	/*
	3- Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
	 */
	public static void main(String[] args) {
		int[] arrInt = {1350, 120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		int max1 = Integer.MIN_VALUE, max2 = Integer.MAX_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] > max1){
				max2 = max1;
				max1 = arrInt[i];
				
			}
			else if (arrInt[i] > max2) max2 = arrInt[i];
		}
		
		System.out.println("Maks degerimiz: " + max1 + " ve en buyuk ikinci degerimiz: " + max2);
		
		Integer[] arrint = {1350, 120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		List<int[]> lit = Arrays.asList(arrInt);
		System.out.println(lit);
		List<Integer> lit2 = Arrays.asList(arrint);
		System.out.println(lit2);
	}
}