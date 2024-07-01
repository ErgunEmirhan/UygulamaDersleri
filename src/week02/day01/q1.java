package week02.day01;

public class q1 {
	public static void main(String[] args) {
		int price = 100;
		float grossPrice;
		float tax = 0.18f;
		float profit = 0.15f;
		grossPrice = (price * (1 -tax -profit));
		System.out.println(grossPrice);
	}
}