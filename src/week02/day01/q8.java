package week02.day01;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz> ");
		int number = sc.nextInt(), total = 0;
		for (int i = 1; i <= number; i++){
			System.out.print((i+1) + " ");
			total += (i+1);
		}
		System.out.println("");
		System.out.println(" --> Toplam: " + total);
		
		total = number*(number+3)/2;
		System.out.println("Formulle toplam: " + total);
		sc.close();
	}
}