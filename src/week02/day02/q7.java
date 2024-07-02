package week02.day02;

import java.util.Scanner;

public class q7 {
	/*
	7- Girilen sayının 5'in kuvveti olup olmadığını bulan program.
	 */
	public static void main(String[] args) {
		int number;
		float temp;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Sayi giriniz> ");
		number = sc1.nextInt();
		temp = number;
		while (temp > 1){
			temp /= 5;
		}
		if (temp == 1){
			System.out.println(number + " sayisi 5'in kuvveti. ");
		}
		else{
			System.out.println(number + " sayisi 5'in kuvveri falan degil. ");
		}
	}
}