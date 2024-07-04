package week02.day04;

public class q3 {
	/*
	3-   "Java,React,Spring" String degerinden bir for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.
	 */
	public static void main(String[] args) {
		String kelime = "Java,React,Spring";
		// virgülün index'ini al oraya kadar olanı yazdır.  Başlangıç noktasını güncelle
		
		int min=0, max, i;
		
		for (i = 0; i < kelime.length(); i++){
			if (kelime.charAt(i) == ','){
				max = i;
				System.out.println(kelime.substring(min, max));
				min = i+1;
			}
			else if (i == kelime.length()-1){
				System.out.println(kelime.substring(min));
			}
			
		}
	}
}