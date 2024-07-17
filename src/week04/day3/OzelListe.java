package week04.day3;
/*
1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi tutsun.
 */


import java.util.Arrays;

public class OzelListe {

	private int[] list = new int[0]; // uzunluk 0 başlatılır.  her add metodu kullanıldığında +1 uzunlukta yeni array
	// oluşturulup değerler oraya aktarılır.
	private int uzunluk = list.length;
	
	public int[] getList() {
		return list;
	}
	
	public int getUzunluk() {
		return uzunluk;
	}
	
	public OzelListe(){
	}
	
	public OzelListe(int[] list){
		this.list = list;
		this.uzunluk = list.length;
	}
	/*
	1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği int türünde sayiyi alacak ve sayi dizimize ekleyecek.
	 */
	public void add(int sayi){ // bir eleman ekleme
		// (listenin uzunluğu+1) uzunlukta temp liste açılıp son yuvaya yeni eleman eklenir.  liste temp'e eşitlenir
		int[] newList = Arrays.copyOf(list,list.length+1);
		newList[list.length] = sayi;
		list = newList;
		uzunluk = list.length;
	}
	
	
	public void add2(int... sayilar){ // add kullanarak bir dizi eleman ekleme
		// her elemana sırayla add() uygulanır
		for (int sayi: sayilar){
			add(sayi);
		}
	}
	
	public void add3(int... sayilar){ // bir dizi eleman ekleme
		// (eski liste uzunluğu + girilen dizi uzunluğu) temp listesinin uzunluğu belirlenir.  eski liste temp'in
		// başına kopyalanır index list.length'ten başlanarak elemanlar sırayla eklenir
		int count = 0;
		int[] tempList = Arrays.copyOf(list,list.length+sayilar.length);
		for (int sayi: sayilar){
			tempList[list.length + count] = sayi;
			count++;
		}
		list = tempList;
		uzunluk = list.length;
	}
	/*
	1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
	 */
	
	public void remove(int index){ // bir eleman çıkarma
		// i eğer index'e büyük eşitse i+1 temp'e eklenir
		int[] newList = new int[list.length-1];
		int count = 0;
		while (count <list.length-1){
			if (count < index) newList[count] = list[count];
			else newList[count] = list[count+1];
			count++;
		}
		
		list = newList;
		uzunluk = list.length;
	}
	
	public void remove2(int index){ // bir eleman çıkarma
		// i >= index ise listenin i. elemanı kendisinden sonrakine eşitlenir.  En son copyOfRange ile sondan önceki
		// elemana kadar alınır.
		for (int i = 0; i < list.length-1; i++) {
			if (i >= index){
				list[i] = list[i+1];
			}
		}
		list = Arrays.copyOfRange(list, 0, list.length-1);
		uzunluk = list.length;
	}
	
	
	public void list(){ //eleman listeleme
		//elemanlar sırayla sb'a eklenir
		StringBuilder sb = new StringBuilder("{");
		for (int number: list){
			sb.append(number + ", ");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		System.out.println(sb);
	}
	
	public void list2(){ // eleman listeleme
		//elemanlar sırayla yazdırılır
		System.out.print("{" + list[0]);
		for (int i = 1; i < uzunluk; i++) {
			System.out.print(", " + list[i]);
		}
		System.out.println("}");
	}
	
	
	
	
	
}