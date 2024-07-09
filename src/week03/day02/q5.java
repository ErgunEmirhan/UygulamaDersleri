package week03.day02;

public class q5 {
	/*
	5 -
Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
	 */
	public static void main(String[] args) {
		int[] arrInt = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int total = 0;
		for (int i = 0; i < arrInt.length; i++) {
			total += arrInt[i];
			if (arrInt[i] % 2 == 0) System.out.println(arrInt[i] + " elemani cifttir.  ");
			else System.out.println(arrInt[i] + " elemani tektir.  ");
		}
		System.out.println("Toplam: " + total);
	}
}