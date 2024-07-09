package week03.day02;

public class q4 {
	/*
	4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
	 */
	public static void main(String[] args) {
		int[] arrInt = {2, -256, 2, 1258, 2, 2};
		boolean adjTwo = false;
		for (int i = 0; i < arrInt.length-1; i++) {
			if (arrInt[i] == 2 && arrInt[i+1] == 2){
				adjTwo = true;
				break;
			}
		}
		if (adjTwo) System.out.println("Ardisik iki adet 2 vardir.  ");
		else System.out.println("Ardisik iki adet 2 yoktur.  ");
	}
}