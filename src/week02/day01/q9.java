package week02.day01;

import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		int count = 0;
		int total = 0;
		int limit = 50;
		int temp, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Boyuna sayi girmenizi isteyecegim! ");
		
		while (total <= limit){
			count++;
			System.out.println("Guncel toplam: " + total);
			System.out.print("Gir gir> ");
			temp = sc.nextInt();
			total += temp;
			
		}
		System.out.println("Eyvah, bu toplam çok yüksek oldu!  Son toplam: " + total + "\n" + "Dongu " + count + " kez calisti. ");
		
		
		count = 0;
		temp = 0;
		total = 0;
		
		for (i = 1; total < 50; i++){
			total += i;
			count++;
		}
		System.out.println("Eyvah, bu toplam çok yüksek oldu!  Son toplam: " + total + "\n" + "Dongu " + count + " kez calisti. ");
	}
}