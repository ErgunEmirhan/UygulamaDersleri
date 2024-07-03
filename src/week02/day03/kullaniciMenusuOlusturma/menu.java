package week02.day03.kullaniciMenusuOlusturma;

import java.util.Scanner;

public class menu {
	/*
	kullanıcıyı konsolda karşıla
	dil seçeneği tr/en
	kullanıcıya menü sun, çıkış yapılmadığı sürece menüde kal
	çıkış yapılınca program sonlandı yazdır
	 */
	public static void main(String[] args) {
		byte command = -1, language;
		int fak = 1, number, i;
		boolean isPrime;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zatı muhtereminizin tesrifi bizi onore etti!/ Welcome!");
		System.out.println("Rica ederiz ki size hizmet verecegimiz lisanı buyurunuz./ Choose language.");
		System.out.print("1. Turkce(TR) \n2. English(EN)\n>");
		language = sc.nextByte();
		if (language == 1){
			while (command != 0){
				System.out.print("------------\n0. Cikis yap.\n1. Merhaba Dunya yazdir.\n2. Faktoriyel hesapla.\n3. " +
						                 "Asal sayi " +
						                 "kontrolu yap.\n-------------\n>");
				command = sc.nextByte();
				if (command == 1){
					System.out.println("Merhaba Dunya");
				}
				else if (command == 2){
					System.out.print("Hangi sayinin faktoriyelini alayim?> ");
					number = sc.nextInt();
					for (i = 2; i <= number; i++){
						fak *= i;
					}
					System.out.println(number + " sayisinin faktoriyeli: " + fak);
					i = 0;
				}
				else if (command == 3){
					System.out.print("Hangi sayinin asalligini kontrol edeyim?> ");
					number = sc.nextInt();
					isPrime = true;
					if (number == 0 || number == 1) System.out.println(number + " asal sayilmaz. ");
					else if (number % 2 == 0) System.out.println(number + " asal degildir hatta cift sayidir. ");
					else {
						for (i = 3; i*i < number; i += 2){
							if (number % i == 0) {
								isPrime = false;
								break;
							}
						}
						i = 0;
					}
					if (isPrime) System.out.println(number + " sayisi asaldir. ");
					else System.out.println(number + " sayisi asal degildir. ");
				}
				else if (command != 0) System.out.println("Duzgun bir deger girmeniz rica olunur. ");
			}
		}
		else if (language == 2){
			while (command != 0){
				System.out.print("------------\n0. Exit.\n1. Print Hello World.\n2. Calculate factorial.\n3. " +
						                 "Check if the number is prime.\n-------------\n>");
				command = sc.nextByte();
				if (command == 1){
					System.out.println("Hello World");
				}
				else if (command == 2){
					System.out.print("The factorial of which number shall be taken?> ");
					number = sc.nextInt();
					for (i = 2; i <= number; i++){
						fak *= i;
					}
					System.out.println("The factorial of "+ number + " is : " + fak);
					i = 0;
				}
				else if (command == 3){
					System.out.print("The primality of which number shall be checked?> ");
					number = sc.nextInt();
					isPrime = true;
					if (number == 0 || number == 1) System.out.println(number + " is not counted as a prime. ");
					else if (number % 2 == 0) System.out.println(number + " is not a prime, it is indeed an even " +
							                                             "number" +
							                                             ". ");
					else {
						for (i = 3; i*i < number; i += 2){
							if (number % i == 0) {
								isPrime = false;
								break;
							}
						}
						i = 0;
					}
					if (isPrime) System.out.println(number + " is prime. ");
					else System.out.println(number + " is not prime. ");
				}
				else if (command != 0) System.out.println("Please enter a decent digit. ");
			}
		}
		else System.out.println("Benim haznemde o dil mevcut bulunmamaktadır./ Which language is that supposed to be?" +
				                        " ");
	}
}