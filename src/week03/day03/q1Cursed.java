package week03.day03;

import java.util.Scanner;

public class q1Cursed {
	/*
	1- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
	 */
	
	// C CE ve sürekli işlem halinde olma ve exit ekle
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hesap makinesi uygulamasina hos geldiniz!");
		double number1S;
		double number2S;
		while (true){
			System.out.print("Birinci sayi> ");
			String number1 = sc.nextLine();
			if (number1.equalsIgnoreCase("exit")) break;
			else number1S = Double.parseDouble(number1);
			System.out.print("Hangi islem?> ");
			char islem = sc.nextLine().charAt(0);
			System.out.print("İkinci sayi> ");
			String number2 = sc.nextLine();
			if (number2.equalsIgnoreCase("exit")) break;
			else number2S = Double.parseDouble(number2);
			
			String sonuc = switch (islem){
				case '+' -> String.valueOf(number1S+number2S);
				
				case '-' -> String.valueOf(number1S - number2S);
				
				case '/'-> (number2S!=0)?(String.valueOf(number1S/number2S)):"0'a bölünmez";
				
				case '*'-> String.valueOf(number1S*number2S);
				
				default -> "Gecerli bir islem giriniz";
				
			};
			
			System.out.println(sonuc);
		}
	}
}