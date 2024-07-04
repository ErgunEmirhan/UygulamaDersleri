package week02.day04;

import java.util.Scanner;

public class q2 {
	/*
	2- Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime yaziniz> ");
		String str = sc.nextLine();
		int count = 0;
		// 'a' bulursan count'u 1 artır, string'i bulduğumuz a'nın sağı olacak şekilde modifiye et
		// eğer 'a' son harf ise sıkıntı çıkabilir bu yüzden try catch kullanıldı
		while (str.indexOf('a') != -1) {
			count++;
			try {
				str = str.substring(str.indexOf('a') + 1);
			}
			catch (Exception e) {
				break;
			}
		}
		System.out.println("girdiginiz kelimedeki a harfi sayisi: " + count);
	}
}