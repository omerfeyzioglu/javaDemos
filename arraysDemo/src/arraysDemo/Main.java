package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin1";
		String ogrenci2 = "Engin2";				
		String ogrenci3 = "Engin3";			
		String ogrenci4 = "Engin4";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
	System.out.println("-------------------------------------------");
	
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin1";		
		ogrenciler[1]="Engin2";	
		ogrenciler[2]="Engin3";	
		ogrenciler[3]="Engin4";	
		//ogrenciler[4]="Engin5";	
		
		for (int i = 0; i < ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);
			
		}
		System.out.println("-------------------------------------------");
		
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
