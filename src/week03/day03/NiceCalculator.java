package week03.day03;

import java.util.Scanner;

public class NiceCalculator {
	/*
	1- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
	 */
	
	// inputHandling ve (içine) help ekle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator is running.  Type help for help!");
		System.out.print("First number> ");
		String number1 = sc.nextLine();
		boolean start = !number1.equalsIgnoreCase("exit");
		String result;
		while (start){
			System.out.println("Operation + second number> ");
			String number2 = sc.nextLine();
			if (number2.equalsIgnoreCase("exit")) break;
			else if (number2.equalsIgnoreCase("CE")){
				System.out.println("Result: 0");
				System.out.print("First number> ");
				number1 = sc.nextLine();
				start = !number1.equalsIgnoreCase("exit");
				continue;
				
			}
			
			result = switch (number2.charAt(0)) {
				case '+' -> addition(Double.parseDouble(number1), Double.parseDouble(number2.substring(1)));
				case '-' -> subtraction(Double.parseDouble(number1), Double.parseDouble(number2.substring(1)));
				case '*' -> multiplication(Double.parseDouble(number1), Double.parseDouble(number2.substring(1)));
				case '/' -> division(Double.parseDouble(number1), Double.parseDouble(number2.substring(1)));
				default -> "Enter a valid operation sign";
			};
			
			System.out.println("Result: " + result);
			number1 = result;
		}
		
		System.out.println("Calculator has been terminated.  ");
	}
	
	public static String addition(double addend1, double addend2){
		return String.valueOf(addend1 + addend2);
	}
	
	public static String subtraction(double minuend, double subtrahend){
		return String.valueOf(minuend - subtrahend);
	}
	
	public static String division(double dividend, double divisor){
		
		return (divisor != 0)?(String.valueOf(dividend/divisor)):("Cannot divide with 0");
	}
	
	public static String multiplication(double multiplicand, double multiplier){
		return String.valueOf(multiplicand*multiplier);
	}
	
	
}