package week02.day01;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ilk sayiyi giriniz> ");
		a = sc.nextInt();
		System.out.println("Ikıncı sayiyi giriniz> ");
		b = sc.nextInt();
		if ((a + b) % 2 == 0){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.println((a + b) / 2.0);
	}
}