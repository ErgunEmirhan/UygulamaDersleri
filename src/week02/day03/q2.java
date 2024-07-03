package week02.day03;

import java.util.Scanner;

public class q2 {
	/*
	
	 */
	public static void main(String[] args) {
		int i, max, number, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bir sayi ver ki mukemmel mi soyleyeyim> ");
		number = sc.nextInt();
		
		max = number;
		//Dongude fazladan number eklendiği için total böyle tanımlanır
		total = -number;
		// eğer i number'ı bölüyorsa number/i de number'ı böler, yapılan işlem sayısı epey azaltılır bu yolla.
		for (i = 1; i < max; i++){
			
			if (number % i == 0){
				max = number / i;
				total += (i != max)? i + max: i;
			}
		}
		System.out.println("Toplam: " + total);
		if (number == total) System.out.println(number + " sayisi mukemmel! ");
		else System.out.println(number + " sayisi mukemmel degil...");
	}
}