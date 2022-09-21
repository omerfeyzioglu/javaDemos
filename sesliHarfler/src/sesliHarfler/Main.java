package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 's';

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("kalın");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("ince");
			break;

		default:
			System.out.println("ne kalın ne ince");
		}

	}

}

//a ı o u ---- e i ö ü