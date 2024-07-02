package week02.day02;

public class q5 {
	/*
	5- 1'den 100'e kadar olan çift sayıların toplamının, tek sayıların toplamına olan oranını bulan program.
	 */
	public static void main(String[] args) {
		int toplamCift = 0, toplamTek = 0, i;
		
		for(i = 1; i < 101; i++){
			if (i % 2 == 0){
				toplamCift += i;
			}
			else{
				toplamTek += i;
			}
		}
		
		System.out.println("Ciftlerin toplami: " + toplamCift + " ve teklerin topllami: " + toplamTek + " sonuc olarak oranlari: " + ((float)toplamCift/toplamTek));
	}
}