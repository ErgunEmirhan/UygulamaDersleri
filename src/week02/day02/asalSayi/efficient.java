package week02.day02.asalSayi;

import java.util.Scanner;

public class efficient {
	public static void main(String[] args) {
		int input, i;
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz> ");
		input = sc.nextInt();
		long start = System.currentTimeMillis();
		
		if (input == 0 || input == 1)
			System.out.println(input + " sayisi asal degildir. ");
		else if (input == 2)
			System.out.println(input + " sayisi asaldir, hatta cift olan tek asal sayidir. ");
		else {
			// Karekökünden küçük herhangi bir sayı bölmezse asaldır.
			if (input % 2 == 0) isPrime = false;
			else{
				for (i = 3; i <= Math.sqrt(input); i++) {
					if (input % i == 0) isPrime = false;
				}
			}
			if (isPrime) System.out.println(input + " sayisi asaldir. ");
			else System.out.println(input + " sayisi asal degildir. ");
		}
		long end = System.currentTimeMillis();
		System.out.println("Programin calismasi " + (end - start)/1000. + " saniye kadar surdu. ");
		
		
	}
}