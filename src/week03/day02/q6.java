package week03.day02;

public class q6 {
	/*
	6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti 4 sayısının adetinden büyükse true değilse false yazdıralım.
-> 1,4,5,6,1,1,4,8
	 */
	public static void main(String[] args) {
		int[] arrInt = {1,4,5,6,1,1,4,8};
		int count1 = 0, count4 = 0;
		
		for (int item: arrInt){
			switch (item){
				case 1:
					count1 += 1;
					break;
				case 4:
					count4 += 1;
					break;
			}
		}
		System.out.println("Dizimizde " + count1 + " adet 1 ve " + count4 + " adet 4 vardir.  ");
		System.out.println((count1 > count4)? (true): (false));
	}
}