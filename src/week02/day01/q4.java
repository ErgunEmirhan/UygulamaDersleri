package week02.day01;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Yasinizi giriniz>\n$ ");
		byte age = sc.nextByte();
		sc.nextLine();
		System.out.print("İsminizi giriniz>\n$ ");
		String name = sc.nextLine();
		System.out.println("Sayin " + name + ", " + age + " yasindasiniz! ");
		
	}
}