package week04;

public class q1 {
	
	public static void main(String[] args) {
		System.out.println(Solution.isPalindrome(123));
	}
}

class Solution {
	public static boolean isPalindrome(int x) {
		if (x<0) return false;
		else if (x< 10) return true;
		int temp = x;
		for (int i = 0; i < (1+Math.log(x)/Math.log(10)); i++){
			temp -= ((temp/Math.pow(10, i))%10)*Math.pow(10, Math.log(temp)/Math.log(10)-i);
			System.out.println(temp);
		}
		
		return temp==0;
	}
}