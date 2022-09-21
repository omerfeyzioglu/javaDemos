package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -333;
		/*
		 * int remainder = number % 2; System.out.println(remainder);
		 */
		
		if(number==1) {
			
			System.out.println("sayı asal değildir.");
			return;
			
		}
		
		
		if (number < 1) {
			System.out.println("geçersiz sayı.");
			return;

		}
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {

				isPrime = false;

			}

		} // if in içinde isPrime ile isPrime==true aynı şey//
		if (isPrime) {
			System.out.println("sayı asaldır.");

		} else {
			System.out.println("sayı asal değildir.");
		}
	}

}
