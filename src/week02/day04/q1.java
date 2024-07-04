package week02.day04;

import java.util.Scanner;

public class q1 {
	/*
	1- Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta yazdıracağım.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Kelime giriniz> ");
		String str = sc.nextLine();
		//0'dan length'e kadar tüm indexler ile harfleri eşleştirip yazdırırız
		for(i = 0; i<str.length(); i++){
			System.out.println(str.charAt(i) + " --> " + i);
		}
	}
}