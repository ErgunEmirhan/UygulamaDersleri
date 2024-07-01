package week02.day01;

import java.util.Scanner;

public class q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number, temp;
		int total = 0;
		
		System.out.println("Sayinizi giriniz> ");
		number = sc.nextDouble();
		temp = number;
		
		while (!(temp < 1)){
			total += (temp % 10);
			temp /= 10;
		}
		
		System.out.println("Basamak toplamlari: " + total);
	}
}