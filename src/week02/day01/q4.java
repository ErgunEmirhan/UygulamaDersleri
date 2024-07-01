package week02.day01;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yasinizi giriniz> ");
		byte age = sc.nextByte();
		System.out.println("İsminizi giriniz> ");
		String name = sc.next();
		System.out.println("Sayin " + name + ", " + age + " yasindasiniz! ");
	}
}