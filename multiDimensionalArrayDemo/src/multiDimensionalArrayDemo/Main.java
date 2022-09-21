package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "a";
		sehirler[0][1] = "b";
		sehirler[0][2] = "c";
		sehirler[1][0] = "d";
		sehirler[1][1] = "e";
		sehirler[1][2] = "f";
		sehirler[2][0] = "g";
		sehirler[2][1] = "h";
		sehirler[2][2] = "j";

		for (int j = 0; j <= 2; j += 1) {

			for (int i = 0; i <= 2; i += 1) {

				System.out.println(sehirler[i][j]);
			}

		}

	}

}
