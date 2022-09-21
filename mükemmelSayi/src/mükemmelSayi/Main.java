package mükemmelSayi;

public class Main {

	public static void main(String[] args) {

		int number = 0;
		int total = 0;
		if (number < 1) {
			System.out.println("mükemmel sayı değildir.");
			return;
		}
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				int pozitifBölen = i;

				total = pozitifBölen + total;

			}

		}
		if (total == number) {

			System.out.println("mükemmel sayı.");
		} else {

			System.out.println("mükemmel sayı değildir.");
		}

	}

}
