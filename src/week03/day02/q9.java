package week03.day02;

public class q9 {
	/*
	2 Boyutlu Array'de çarpım tablosunu yazdıralım.
	 */
	public static void main(String[] args) {
		int[][] carpim = new int[2][11];
		
		// Array oluşturma
		for (int i = 0; i < carpim.length; i++) {
			
			for (int j = 0; j < carpim[i].length; j++) {
				carpim[i][j] = j;
			}
			
		}
		
		// Tabloyu yazdırma
		for (int i = 0; i < carpim[0].length; i++) {
			System.out.println("----------- " + i + " lerin carpim tablosu-----");
			for (int j = 0; j < carpim[0].length; j++) {
				System.out.println(carpim[0][i] + "\tx\t" + carpim[1][j] + "\t=\t" + (carpim[0][i]*carpim[1][j]));
			}
			System.out.println("--------------------------------");
		}
	}
}