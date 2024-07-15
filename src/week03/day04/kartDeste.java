package week03.day04;

import java.util.Arrays;

public class kartDeste {
	/*
	52'lik iskambil destesi oluşturup deste karıştırılsın.  Deste oluşturulurken 4 renk için String array ve 13 sayı için String array açılıp for döngüleriyle birleştirilip deste array'i oluşturulsun.  en son elimizde String[] olsun, String[][] olmasın.
	papazKacti metodu yazılsın, metod destedeki maça papazı dışındaki papazlar çıkartsın.
	Altmışaltı oyununu oynamak için altmisAlti metodu ile destede sadece 9, 10, Vale, Dam, Papa ve As bırakılsın (her renkten).
	Örnek kart string'i: "Maça 6", "Sinek V"
	String[] suit = new String[]{"Maça", "Kupa", "Karo", "Sinek"};
	String[] number = new String[]{"2","3","4","5","6", "7", "8", "9", "T", "J", "Q", "K", "A"};
	 */
	public static void main(String[] args) {
		String[] deck = deste();
		System.out.println(Arrays.toString(deck));
		String[] papazOyunu = papazKacti(deck);
		System.out.println(Arrays.toString(papazOyunu));
		String[] _66 = altmisAlti(deck);
		System.out.println(Arrays.toString(_66));
	}
	
	
	
	
	static String[] deste(){
		String[] suit = new String[]{"Maça", "Kupa", "Karo", "Sinek"};
		String[] number = new String[]{"2","3","4","5","6", "7", "8", "9", "T", "J", "Q", "K", "A"};
		String[] deck = new String[suit.length*number.length];  // 52 uzunluğunda array
		
		for (int i = 0; i < suit.length; i++) {
			// maça kupa falan
			for (int j = 0; j < number.length; j++) { // 3, 5 falan
				deck[i*number.length + j] = suit[i] + " " + number[j];
			}
		}
		return deck;
	}
	
	
	
	static String[] papazKacti(String[] deck){
		String[] tempArr = new String[49];
		int tempIdx = 0;
		for (String card: deck){
			if(!(!card.split(" ")[0].equals("Maça") && card.split(" ")[1].equals("K"))) {
				tempArr[tempIdx] = card;
				tempIdx++;
			}
		}
		return tempArr;
	}
	
	static String[] altmisAlti(String[] deck) {
		String[] tempArr = new String[24];
		int tempIdx = 0;
		for (String card: deck){
			for (String number: new String[]{"9", "T", "J", "Q", "K", "A"}) {
				/*
				if (card.contains(number)
				 */
				if (card.split(" ")[1].equals(number)) {
					tempArr[tempIdx] = card;
					tempIdx++;
					break;
				}
			}
		}
		return tempArr;
	}
}