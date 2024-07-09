package week03.day02;

import java.util.Scanner;

public class q1 {
	/*
	1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
	 */
	public static void main(String[] args) {
		String[] ulkeler = {"Turkiye", "Japonya", "Mogolistan", "Amerika", "Rusya", "Cin"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir ulke giriniz> ");
		String ulke = sc.nextLine();
		boolean isHere = false;
		for (int i = 0; i < ulkeler.length; i++) if (ulkeler[i].equalsIgnoreCase(ulke)) isHere = true;
		
		
		if (isHere) System.out.println(ulke + " ulkesi bizim array'de bulunuyor.  ");
		else System.out.println(ulke + " ulkesi bizim array'de bulunmuyor.  ");
	}
}