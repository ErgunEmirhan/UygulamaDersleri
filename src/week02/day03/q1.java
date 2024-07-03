package week02.day03;

import java.util.Scanner;

public class q1 {
	/*
	burç hesabı
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dogdugunuz ayi giriniz> ");
		int month = sc.nextInt();
		System.out.print("Dogdugunuz gunu giriinz> ");
		int day = sc.nextInt();
		
		// Kabakuvvet
		String burc = "";
		if ((month == 3 && day > 20)||(month == 4 && day < 21)) burc = "Koc";
		else if ((month == 4 && day > 20)||(month == 5 && day < 22)) burc = "Boga";
		else if ((month == 5 && day > 21)||(month == 6 && day < 23)) burc = "Ikizler";
		else if ((month == 6 && day > 22)||(month == 7 && day < 23)) burc = "Yengec";
		else if ((month == 7 && day > 22)||(month == 8 && day < 23)) burc = "Aslan";
		else if ((month == 8 && day > 22)||(month == 9 && day < 23)) burc = "Basak";
		else if ((month == 9 && day > 22)||(month == 10 && day < 23)) burc = "Terazi";
		else if ((month == 10 && day > 22)||(month == 11 && day < 22)) burc = "Akrep";
		else if ((month == 11 && day > 21)||(month == 12 && day < 22)) burc = "Yay";
		else if ((month == 12 && day > 21)||(month == 1 && day < 22)) burc = "Oglak";
		else if ((month == 1 && day > 21)||(month == 2 && day < 20)) burc = "Kova";
		else if ((month == 2 && day > 19)||(month == 3 && day < 21)) burc = "Balik";
		
		
		System.out.println("(if)Burcunuz: " + burc);
		
		
		// Ay belliyse burç için 2 ihtimal var, o yüzden günü boolean'a atıp ternary kurduk
		switch (month){
			case 3:
				burc = (day < 21) ? "Balık" : "Koc";
				break;
			case 4:
				burc = (day < 21) ? "Koc" : "Boga";
				break;
			case 5:
				burc = (day < 22) ? "Boga" : "Ikizler";
				break;
			case 6:
				burc = (day < 23) ? "Ikizler" : "Yengec";
				break;
			case 7:
				burc = (day < 23) ? "Yengec" : "Aslan";
				break;
			case 8:
				burc = (day < 23) ? "Aslan" : "Basak";
				break;
			case 9:
				burc = (day < 23) ? "Basak" : "Terazi";
				break;
			case 10:
				burc = (day < 23) ? "Terazi" : "Akrep";
				break;
			case 11:
				burc = (day < 22) ? "Akrep" : "Yay";
				break;
			case 12:
				burc = (day < 22) ? "Yay" : "Oglak";
				break;
			case 1:
				burc = (day < 22) ? "Oglak" : "Kova";
				break;
			case 2:
				burc = (day < 20) ? "Kova" : "Balık";
				break;
		};
		
		System.out.println("(switch)Burcunuz: " + burc);
		
		
		sc.close();
	}
}