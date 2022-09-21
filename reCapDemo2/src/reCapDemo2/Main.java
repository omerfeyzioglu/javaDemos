package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = new double[8];
		myList[0] = 1.2;
		myList[1] = 2.3;
		myList[2] = 3.4;
		myList[3] = 4.5;
		myList[4] = 5.6;
		myList[5] = 6.7;
		myList[6] = 7.8;
		myList[7] = 8.9;

		double total = 0;
		double max = myList[0];
		for (double number : myList) {

			if (max < number) {
				max = number;
			}

			System.out.println(number);
			total = total + number;

		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max); 
	}

}
