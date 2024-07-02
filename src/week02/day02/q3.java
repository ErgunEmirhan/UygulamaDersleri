package week02.day02;

import java.util.Scanner;

public class q3 {
	/*
	3-klavyeden 0 girilene kadar sayı okumaya devam et, 0 griilince sayıların toplamı ve ortalamasını yazdır
	 */
	public static void main(String[] args) {
	
		int count = -1, temp = -1;
		float average = 0, total = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Sayilar girmenizi isteyecegim. ");
		
		while (temp != 0){
			System.out.print("Buyur gir(Cikmak icin 0'i tuslayiniz)> ");
			temp = sc1.nextInt();
			count++;
			total += temp;
		}
		// döngüde temp 0 verildiğinde de count artırılıyor o yüzden count -1'den başlatıldı ve if eklendi
		if (count != 0)
			average = total / count;
		
		System.out.println("Toplam: " + total + " ve ortalama: " + average);
	}
}