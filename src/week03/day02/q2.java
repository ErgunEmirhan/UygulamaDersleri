package week03.day02;

public class q2 {
	/*
	2- En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
	 */
	public static void main(String[] args) {
		int[] arrInt = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			min = (min < arrInt[i])? (min): (arrInt[i]);
			max = (max > arrInt[i])? (max): (arrInt[i]);
		}
		
		System.out.println("Maks sayi: " + max + " ve min sayi: " + min);
	}
}