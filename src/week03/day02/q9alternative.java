package week03.day02;

import java.util.Arrays;

public class q9alternative {
	// carpim tablosu
	public static void main(String[] args) {
		String[][] carpim = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				carpim[i][j] = ("\t" + i + "\tx\t" + j + "\t=\t" + i*j +"\n");
			}
		} System.out.println(Arrays.deepToString(carpim));
	}
}