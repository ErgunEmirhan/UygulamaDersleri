package week02.day01;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz> ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++){
			System.out.print((i+1) + " ");
		}
	}
}