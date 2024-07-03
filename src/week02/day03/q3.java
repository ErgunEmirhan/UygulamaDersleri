package week02.day03;

import java.util.Scanner;

public class q3 {
	/*
	0-100 arası sayı alcaz kullanıcıdan, en büyük ve en küçük sayıyı yazdıracağız
	 */
	public static void main(String[] args) {
		
		int count = 1, min = 100, max = 0, temp;
		Scanner sc = new Scanner(System.in);
		
		// Math.min() kullanmadan
		while (count <= 5) {
			System.out.print(count + ". sayinizi giriniz> ");
			temp = sc.nextInt();
			if (temp < 0 || temp > 100) System.out.println("Sayinizi 0-100 araliginda giriniz. ");
			else {
				count++;
				min = (temp < min) ? temp : min;
				max = (temp > max) ? temp : max;
			}
		}
		System.out.println("Girilen sayilarin en buyugu: " + max + " ve en kucugu: " + min);
		
		
		count = 1;
		min = 100;
		max = 0;
		while (count <= 5) {
			System.out.print(count + ". sayinizi giriniz> ");
			temp = sc.nextInt();
			if (temp < 0 || temp > 100) System.out.println("Sayinizi 0-100 araliginda giriniz. ");
			else {
				count++;
				min = Math.min(min, temp);
				max = Math.max(max, temp);
			}
		}
	}
}