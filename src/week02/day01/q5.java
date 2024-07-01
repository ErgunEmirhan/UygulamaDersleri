package week02.day01;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yaricap kactir?> ");
		double radius = sc.nextDouble();
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.println("Cemberin cevresi: " + circumference + " ve alani: " + area);
	}
}