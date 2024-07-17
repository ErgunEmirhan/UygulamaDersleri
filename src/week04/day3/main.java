package week04.day3;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		OzelListe ol = new OzelListe(new int[]{3, 5, 7});
		System.out.println(ol.getUzunluk());
		System.out.println(Arrays.toString(ol.getList()));
		ol.add2(3, 6, 1, 2, 5, 7, 124, 74);
		System.out.println(ol.getUzunluk());
		System.out.println(Arrays.toString(ol.getList()));
		int[] lit = new int[]{3, 6, 1, 2, 5, 7, 124, 74};
		ol.add2(lit);
		System.out.println(ol.getUzunluk());
		System.out.println(Arrays.toString(ol.getList()));
		ol.remove2(18);
		System.out.println(ol.getUzunluk());
		System.out.println(Arrays.toString(ol.getList()));
		ol.remove(16);
		System.out.println(ol.getUzunluk());
		ol.list();
		ol.list2();
		System.out.println("Sirada yeni liste var.");
		OzelListe ol2 = new OzelListe();
		ol2.add3(3, 5, 1, 2, 5, 6, 1, 2, 5);
		ol2.list2();
		
	}
}