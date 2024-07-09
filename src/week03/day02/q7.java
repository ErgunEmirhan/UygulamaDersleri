package week03.day02;

public class q7 {
	/*
	7- Dizide 13 sayısına denk gelene kadar devam edelim. 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise 13'den sonra gelen sayıyı toplama ekleyelim.
-> 1, 13, 13, 13, 5, 13
	 */
	public static void main(String[] args) {
		int[] arrInt = {1, 13, 13, 13, 5, 13};
		int total = 0;
		for (int i = 0; i < arrInt.length-1; i++) {
			if (arrInt[i] == 13 && arrInt[i+1] != 13){
				total += arrInt[i+1];
			}
		}
		System.out.println("Kurala gore toplam: " + total);
	}
}