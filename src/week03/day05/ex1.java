package week03.day05;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
	/*
	3- Dizi boyutu ve dizi elemanları dışarıdan alınmak üzere dizi içerisindeki elemanların ortalamasını, standart sapmasını ve medyanını bulan program.
	 */
	public static void main(String[] args) {
		int[] sayilar = createArray();
		System.out.println(takeAvg(sayilar.length, sayilar));
		System.out.println(takeStandardDevation(sayilar.length, sayilar));
		System.out.println(findMedian(sayilar.length, sayilar));
		System.out.println(Arrays.toString(sayilar));
		
	}
	
	
	static int[] createArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizinin uzunlugu kac olacak?");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.print((i+1) + ". elemani giriniz> ");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	static double takeAvg(int len, int[] sayilar){
		int total = 0;
		for (int sayi: sayilar){
			total += sayi;
		}
		return (double)total/len;
	}
	
	static double takeStandardDevation(int len, int[] sayilar){
		double avg = takeAvg(len, sayilar), result=0;
		for (int sayi: sayilar){
			result += (sayi-avg)*(sayi-avg);
		}
		return Math.sqrt((result/(len-1)));
	}
	
	static double findMedian(int len, int[] sayilar){
		Arrays.sort(sayilar);
		return (len % 2 == 1)? (sayilar[len/2]): ((sayilar[-1+len/2] + sayilar[len/2])/2.);
	}
}