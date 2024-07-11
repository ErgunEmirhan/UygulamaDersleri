package week03.day04;

import java.util.Arrays;

public class kartDeste {
	/*
	52'lik iskambil destesi oluşturup deste karıştırılsın.  Deste oluşturulurken 4 renk için String array ve 13 sayı için String array açılıp for döngüleriyle birleştirilip deste array'i oluşturulsun.  en son elimizde String[] olsun, String[][] olmasın.
	papazKacti metodu yazılsın, metod destedeki maça papazı dışındaki papazlar çıkartsın.
	Altmışaltı oyununu oynamak için altmisAlti metodu ile destede sadece 9, 10, Vale, Dam, Papa ve As bırakılsın (her renkten).
	Örnek kart string'i: "Maça 6", "Sinek V"
	 */
	public static void main(String[] args) {
		String[] deck = deste();
		System.out.println(Arrays.toString(deck));
		String[] papazOyunu = papazKacti(deck);
		System.out.println(Arrays.toString(papazOyunu));
		String[] _66 = altmisAlti(deck);
		System.out.println(Arrays.toString(_66));
	}
	
	static String[] altmisAlti(String[] deck) {
		String[] tempArr = new String[24];
		int tempIdx = 0;
		for (String card: deck){
			for (String number: new String[]{"9", "T", "V", "D", "R", "A"}) {
				if (card.split(" ")[1].equals(number)) {
					tempArr[tempIdx] = card;
					tempIdx++;
					break;
				}
			}
		}
		return tempArr;
	}
	
	
	static String[] deste(){
		String[] suit = new String[]{"Pik", "Kör", "Karo", "Trefl"};
		String[] number = new String[]{"2","3","4","5","6", "7", "8", "9", "T", "V", "D", "R", "A"};
		String[] deck = new String[suit.length*number.length];
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < number.length; j++) {
				deck[i*number.length + j] = suit[i] + " " + number[j];
			}
		}
		return deck;
	}
	
	static String[] papazKacti(String[] deck){
		String[] tempArr = new String[49];
		int tempIdx = 0;
		for (String card: deck){
			if(!(!card.split(" ")[0].equals("Pik") && card.split(" ")[1].equals("R"))) {
				tempArr[tempIdx] = card;
				tempIdx++;
			}
		}
		return tempArr;
	}
}