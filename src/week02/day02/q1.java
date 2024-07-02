package week02.day02;

import java.util.Scanner;

public class q1 {
	/*
	1- taban değeri ve üs input, kullanıcı ismi input, taban^üs hesapla, ÇIKTI isim + sonuc
	 */
	public static void main(String[] args) {
		int base, power, result;
		String name;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Taban degeri gir> ");
		base = sc1.nextInt();
		System.out.print("Kuvveti gir> ");
		power = sc1.nextInt();
		
		for(result = 1; power != 0; power--){
			result *= base;
		}
		
		sc1.nextLine();
		System.out.print("Isminiz> ");
		name = sc1.nextLine();
		
		System.out.println(name + " " + result);
		// veya result = Math.pow(base, power);
	}
}