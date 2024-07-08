package week03.day01;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		
		/**
		 * Menu:
		 * 1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu ve index
		 * numaralarını yazdırın. Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.
		 * 	2- Dışarıdan bir kelime giriniz. Daha sonra değiştirmek istediğiniz harfi giriniz ve hangi harfle
		 * 	değiştireceğinizi belirtin. Eğer kelimemiz içerisinde o harf varsa değiştirsin.
		 * 3- Dışarıdan girilen bir kelimeyi ters çevirip yazdıralım. Ayrıca bu kelimenin bir palindrom olup
		 * olmadığını kontrol edelim (örneğin: "kek", "iki", "kabak", "saippuakivikauppias").
		 * 4- Dışarıdan 5 adet kelime girelim. Her kelimenin a, b veya c ile başlayıp başlamadığını kontrol edelim. Ayrı ayrı sayfa açıldığını düşünelim; a ile başlayanlar bir sayfaya, b ile başlayanlar bir sayfaya, c ile başlayanlar bir sayfaya yazılsın. Diğer harflerle başlayanlar için ayrı bir sayfa düşünelim. Sonrasında girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa olduğunu ekrana yazdıralım.
		 * 0 - Çıkış
		 */
		
		System.out.println("Programa hos geldiniz.  ");
		Scanner sc = new Scanner(System.in);
		
		MainMenu:
		while (true){
			System.out.println("------------------\n1. Harf Nerede?\n2. Harf Degistir\n3. Kelime Cevirmece + " +
					                   "Palindrom mu?\n4. a, b, c ile mi Basliyor?\n0. Cikis\n----------------------");
			System.out.print("Fonksiyon seciniz> ");
			byte menuInput = -1;
			try {
				menuInput = sc.nextByte();
			}
			catch (Exception e) {
				System.out.println("Sayi giriniz.");
				sc.nextLine();
				continue;
			}
			sc.nextLine();
			
			switch (menuInput){
				case 1:
					System.out.println("---------------------\nBir kelime ve bir harf gireceksiniz.  Harfin kelimede " +
							                   "kaç tane olduğunu " +
							                   "index'leriyle beraber göstereceğiz.  Yoksa harfin olmadığı " +
							                   "belirtilecektir.\n--------------------\n");
					int count = 0;
					System.out.print("Kelimenizi giriniz> ");
					String kelime = sc.nextLine();
					System.out.print("Harfinizi giriniz> ");
					char harf = sc.nextLine().charAt(0);
					boolean isHarf = false;
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf) {
							count += 1;
							System.out.println(harf + " " + i + ". index'te var");
							isHarf = true;
						}
					}
					System.out.println("Toplam " + count + " adet var.  ");
					if (!isHarf) System.out.println(harf + " harfi " + kelime + " kelimesinde bulunmuyor.");
					break;
					
				case 2:
					System.out.println("---------------------\nBir kelime ve iki harf gireceksiniz.  Kelimedeki ilk " +
							                   "girilen harfler ikinci girilen ile " +
							                   "degistirilecek\n--------------------\n");
					System.out.print("Kelimenizi giriniz> ");
					String kelimeEski = sc.nextLine();
					System.out.print("Degisecek harfi giriniz> ");
					char harfEski = sc.nextLine().charAt(0);
					System.out.println("Hangi harf ile degissin");
					char harfYeni = sc.nextLine().charAt(0);
					String kelimeYeni = kelimeEski.replace(harfEski, harfYeni);
					System.out.println("Eski hal: " + kelimeEski + "Yeni hal: " + kelimeYeni);
					break;
					
				case 3:
					System.out.println("----------------\nBir kelime gireceksiniz.  Ters cevirilecek ev palindrom mu " +
							                   "kontrol edilecek.\n-------------------");
					System.out.print("Bir kelime giriniz> ");
					String palindrom = sc.nextLine().toLowerCase();
					String palindrom2 = "";
					for (int i = 0; i < palindrom.length(); i++) {
						palindrom2 = palindrom.charAt(i) + palindrom2;
					}
					System.out.println((palindrom.equals(palindrom2)) ? (palindrom + " kelimesi palindromdur.  ") :
							                   (palindrom + " kelimesi palindrom değildir, tersi: " + palindrom2));
					
					break;
					
				case 4:
					String[] a = new String[5];
					byte aCount = 0;
					String[] b = new String[5];
					byte bCount = 0;
					String[] c = new String[5];
					byte cCount = 0;
					String[] diger = new String[5];
					byte digerCount = 0;
					System.out.println("5 adet kelime gireceksiniz.  Bunlar ilk harflerine gore kategorize " +
							                   "edileceklerdir.");
					String temp;
					for (int i = 0; i < 5; i++) {
						temp = sc.nextLine();
						switch (temp.charAt(0)){
							case 'a':
								a[aCount] = temp;
								aCount++;
								break;
							case 'b':
								b[bCount] = temp;
								bCount++;
								break;
							case 'c':
								c[cCount] = temp;
								cCount++;
								break;
							default:
								diger[digerCount] = temp;
								digerCount++;
								break;
								
						}
					}
					System.out.print("a ile baslayan kelimeler: ");
					for (int i = 0; i < aCount; i++) {
						System.out.print(a[i] + " ");
					}
					System.out.println();
					System.out.print("b ile baslayan kelimeler: ");
					for (int i = 0; i < bCount; i++) {
						System.out.print(b[i] + " ");
					}
					System.out.println();
					System.out.print("c ile baslayan kelimeler: ");
					for (int i = 0; i < cCount; i++) {
						System.out.print(c[i] + " ");
					}
					System.out.println();
					System.out.print("Kalan kelimeler: ");
					for (int i = 0; i < digerCount; i++) {
						System.out.print(diger[i] + " ");
					}
					System.out.println();
					break;
				case 0:
					System.out.println("Program sonlandiriliyor, gorusmek uzere!");
					break MainMenu;
				default:
					System.out.println("Gecersiz bir deger girildi.  ");
					
			}
			
		}
		
	}
}