package week02.day01;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		int number, factorial;
		factorial = 1;
		System.out.println("Sayi giriniz faktoriyelini alayim> ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (int i = 0 ; i < number;i++){
			factorial *= (i+1);
		} System.out.println("Faktoriyel degeri: " + factorial);
	}
}