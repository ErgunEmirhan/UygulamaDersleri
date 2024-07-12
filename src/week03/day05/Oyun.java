package week03.day05;

import java.util.Scanner;

public class Oyun {
	/*
	
	 */
	// Taş kağıt maks oyunu
	
	public static void main(String[] args) {
		tasKagitMakas();
	}
	
	static void tasKagitMakas(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Tas kagit makas oyununa hos geldiniz!");
		
		//  userWinCt, cpuWinCt, total
		int[] sonuclar = {0, 0, 0};
		byte moveUser;
		while (true){
			moveUser = degerAl();
			if (moveUser == 4) {
				System.out.println("Program sonlandirildi.  Son durum:\nGalibiyetiniz: " + sonuclar[0] +
						                   "\nMaglubiyetiniz: " + sonuclar[1] + "\nBeraberlik: " + (sonuclar[2]-sonuclar[1]-sonuclar[0]) + "\nToplam mac sayisi: " + sonuclar[2]);
				break;
			}
			byte moveCpu = (byte)(Math.random()*3+1);
			sonuclar = degerlendirme(moveUser, moveCpu, sonuclar);
		}
		
	}
	
	static int[] degerlendirme(int moveUser, int moveCpu, int[] sonuclar){
		String[] arr = new String[]{"Tas", "Kagit", "Makas"};
		int modulo = ((moveUser-moveCpu+3)%3);
		sonuclar[2] += 1;
		switch (modulo){
			case 2:
				sonuclar[1] += 1;
				System.out.println(arr[moveUser-1] + "'iniz " + arr[moveCpu-1] + " ile hezeyana ugradi.");
				System.out.println("Galibiyetiniz: " + sonuclar[0]);
				System.out.println("Maglubiyetiniz: " + sonuclar[1]);
				System.out.println("Beraberliginiz: " + ((sonuclar[2])-sonuclar[0]-sonuclar[1]));
				break;
			
			case 1:
				sonuclar[0] += 1;
				System.out.println(arr[moveUser - 1] + "'iniz " + arr[moveCpu-1] + "'i devirdi gecti.");
				System.out.println("Galibiyetiniz: " + sonuclar[0]);
				System.out.println("Maglubiyetiniz: " + sonuclar[1]);
				System.out.println("Beraberliginiz: " + ((sonuclar[2]) - sonuclar[0] - sonuclar[1]));
				break;
			
			case 0:
				System.out.println(arr[moveUser - 1] + "'iniz " + arr[moveCpu-1] + " ile berabere kaldi.");
				System.out.println("Galibiyetiniz: " + sonuclar[0]);
				System.out.println("Maglubiyetiniz: " + sonuclar[1]);
				System.out.println("Beraberliginiz: " + ((sonuclar[2]) - sonuclar[0] - sonuclar[1]));
				break;
			
		}
		return sonuclar;
	}
	static byte degerAl(){
		Scanner sc = new Scanner(System.in);
		byte moveUser;
		while (true) {
			try {
				System.out.print("--------------\n1. Tas\n2. Kagit\n3. Makas\n4. /Exit/\n---------------\n> ");
				moveUser = sc.nextByte();
				if (!(1 <= moveUser && moveUser <= 4)) {
					System.out.println("Girilebilecek degerler: 1 - 2 - 3 - 4");
					continue;
				}
				break;
				
			}
			catch (Exception e) {
				System.out.println("Duzgun bir deger giriniz.");
			}
		}
		return moveUser;
	}
	
}