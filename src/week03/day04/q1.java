package week03.day04;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
	/*
	1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
 
Örnegin;

Çadır - > Cadir
	 */
	public static void main(String[] args) {
		
		System.out.println(toEN("Şalömğat"));
		System.out.println(sum());
		System.out.println(step4(10));
		System.out.println(minDiff(new int[]{ 1, 5, -4, 3 }));
	}
	
	static String toEN(String tr) {
		String[] ingilizceKarakter = {"I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O"};
		String[] turkceKarakter = {"İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö"};
		StringBuilder en = new StringBuilder(tr);
		for (int i = 0; i < tr.length(); i++)
			for (int j = 0; j < turkceKarakter.length; j++)
				if (turkceKarakter[j].equals(en.substring(i, i+1))) en.replace(i, i+1, ingilizceKarakter[j]);
		return en.toString();
	}
	
	/*
	2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).
 
2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
	 */

	static int sum(){
		Scanner sc = new Scanner((System.in));
		System.out.println("How many integers will you add?");
		return switch (sc.nextInt()){
			case 2-> {
				System.out.println("enter two numbers");
				yield sum(sc.nextInt(), sc.nextInt());
			}
			case 3->{
				System.out.println("enter three numbers");
				yield sum(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			default -> Integer.MIN_VALUE;
		};
	}
	
	static int sum(int n1, int n2){
		return n1 + n2;
	}
	
	static int sum(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
	
	/*
	3- Kullanici disaridan bir sayi girecek.
 
Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.
	 */
	
	static int step1(int n1){
		return n1 + 50;
	}
	
	static int step2(int n1){
		return step1(n1)*30;
	}
	
	static int step3(int n1){
		return step2(n1) - 40;
	}
	
	static double step4(int n1){
		return (step3(n1) / 20.);
	}
	
	/*
	4- Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
int[] array = { 1, 5, -4, 3 };
	 */
	
	static int minDiff(int[] arr){
		int[] tempArr = arr;
		Arrays.sort(tempArr);
		int minDif = Integer.MAX_VALUE, tempDiff;
		for (int i = 0; i < tempArr.length-1; i++) {
			tempDiff = Math.abs(tempArr[i] - tempArr[i+1]);
			minDif = (tempDiff < minDif)? (tempDiff): (minDif);
		}
		
		return minDif;
	}
}