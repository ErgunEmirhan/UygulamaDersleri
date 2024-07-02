package week02.day02;

import java.util.Scanner;

public class q4 {
	/*
	4- Kulanıcının girdiği sayının çarpım tablosunu yazdıran program. (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )
	 */
	public static void main(String[] args) {
		int number, i;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Hangi sayinin carpim tablosunu istersiniz> ");
		number = sc1.nextInt();
		
		for (i = 0; i < 11; i++){
			System.out.println(number + "x" + i + " = " + number*i);
		}
	}
}