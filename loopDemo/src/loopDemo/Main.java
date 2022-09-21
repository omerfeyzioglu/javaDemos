package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);

		}
		System.out.println("forLoop is over.");
		// While
		int i = 2;
		while (i < 10) {

			System.out.println(i);
			i = i + 2;

		}
		System.out.println("whileLoop is over.");

		// Do-While
		int j = 100;
		do {
			if (j < 10) {
				System.out.println(j);
				j += 2;
			} else {
				System.out.println("Logged");
			}

		} while (j < 10);
		System.out.println("doWhile loop is over.");

	}

}
