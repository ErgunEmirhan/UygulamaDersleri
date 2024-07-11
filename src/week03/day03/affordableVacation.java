package week03.day03;

import java.util.Arrays;

public class affordableVacation {
	public static void main(String[] args) {
		
		System.out.println(findMinCost(10, 2, new int[]{3, 7, 6}));
	}
	public static String findMinCost(int money, int days, int[] cost) {
		
		Arrays.sort(cost);
		int total = 0, day = 0;
		for (int i = 0; i < days; i++){
			if ((total + cost[i]) <= money) {
				day += 1;
				total += cost[i];
			}
			else return ("days: " + day);
		}
		return ("money: " + total);
	}
	
}