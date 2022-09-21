package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 210;
		int sayi3 = 210;
		
		String message = " en büyük sayıdır.";
		
		if(sayi1==sayi2 & sayi2==sayi3){
	    	
	    	System.out.println("Tüm elemanlar birbirine eşittir.");
	    }
		
		else if(sayi1>=sayi2 & sayi1>=sayi3) {
	    	
	    	System.out.println(sayi1 + message);
	    	
	    }else if(sayi2>=sayi1 & sayi2>=sayi3) {
	    	
	    	System.out.println(sayi2 + message);
	    	
	    }else if(sayi3>=sayi1 & sayi3>=sayi2) {
	    	
	    	System.out.println(sayi3 + message);
	    
	    }
	  
	    
	        

		
		
		
		
	}

}
