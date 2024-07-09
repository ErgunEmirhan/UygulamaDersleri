package week03.day02;

public class q8 {
	/*
	8- String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek çıktıyı almaya çalışalım;
 
"Adana şehrinin plaka kodu : 01"

Aşağdaki şehirler tek bir String degerdir.
-> 01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya
	 */
	public static void main(String[] args) {
		String input = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;" +
				"09-Aydın;10-Balıkesir;42-Konya";
		// Son şehir okunsun diye en sonra ; ekledik
		input += ";";
		// ; indexleri için minStr, array'lerde dolu eleman sayısı için arrCount, kısa çizgi index'i için hypStr
		int minStr = -1;
		int arrCount = 0;
		int hypStr = 0;
		// Şehir isimleri için arrStr, plaka kodları için arrNum
		String[] arrStr = new String[input.length()];
		String[] arrNum = new String[input.length()];
		//ilk plaka alır, sonra şehir alır.  Şehir aldığında arrCount++
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '-'){
				arrNum[arrCount] = input.substring(minStr+1, i);
				hypStr = i;
			}
			else if (input.charAt(i) == ';'){
				arrStr[arrCount] = input.substring(hypStr + 1, i);
				minStr = i;
				arrCount++;
			}
		}
		
		for (int i = 0; i < arrCount; i++) {
			System.out.println(arrStr[i] + " sehrinin plaka kodu : " + arrNum[i]);
		}

	}
}