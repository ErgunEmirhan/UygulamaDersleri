package week02.day02;

import java.util.Scanner;

public class q6ButBetter {
	/*
	6- Telefon kodu ve Email kodumuz olsun (Numerik ve bunları elle girebiliriz) Sonrasında kullanıcıdan kodları girmesini isteyeceğiz, e-mail kodu hatalıysa ona göre bir mesaj, sms kodu hatalıysa ona göre bir mesaj, ikisi de doğru girildiğinde de "Başarıyla giriş yaptınız".
	 */
	public static void main(String[] args) {
		String mobile = "150505", mail = "454545", tempMobile = null, tempMail = null;
		boolean isMobile = false, isMail = false;
		
		Scanner sc1 = new Scanner(System.in);
		
		while (!(isMobile && isMail)) {
			if (!isMobile) {
				System.out.print("Mobil kodunuzu giriniz> ");
				tempMobile = sc1.nextLine();
				System.out.println(tempMobile);
			}
			if (!isMail) {
				System.out.print("Mail kodunuzu giriniz> ");
				tempMail = sc1.nextLine();
				System.out.println(tempMail);
			}
			
			if (!(tempMobile.equals(mobile)) && !(tempMail.equals(mail))) {
				System.out.println("iki kod da hatali, dogrusunu giriniz. ");
			}
			else if (!tempMobile.equals(mobile)) {
				System.out.println("Mail kodu dogru ancak mobil kodu hatali, dogrusunuzg giriniz. ");
				isMail = true;
			}
			else if (!tempMail.equals(mail)) {
				System.out.println("Mobil kodunuz dogru ancak mail kodu hatali, dogrusunu giriniz. ");
				isMobile = true;
			}
			
			else {
				System.out.println("Basariyla giris yapildi! ");
				isMail = true;
				isMobile = true;
			}
		}
	}
}