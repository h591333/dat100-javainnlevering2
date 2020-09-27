package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] tab1 = {1,2,3};
		int[] tab2 = {4,5,6};
		
		//SkrivUt(tab);
		
		System.out.println(tilStreng(tab1));
		
		//summer(tab);
		//finnesTall(tab,0);
		//System.out.println(finnesTall(tab,0));
		//System.out.println(posisjonTall(tab,4));
		//reverser(tab);
		//System.out.println(erSortert(tab));
		//skrivUt(settSammen(tab1,tab2));
		
		
	}
	// a)
	
	
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[ ");
		
		for (int i = 0; i < tabell.length; i++) {
			
			System.out.print(tabell[i] + " ");	
		}
		System.out.print(" ]");
	}

	
	
	// b)
	
	
	public static String tilStreng(int[] tabell) {
		String Streng	= ("[");
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (i != tabell.length-1 ) {
			
				//System.out.print(tabell[i]+ ",");
				
				Streng += (tabell[i] + ",");
					
			} else {
				
				//System.out.print(tabell[i]);
				
				Streng += (tabell[i]);
			}
			
		}
		Streng += ("]");
		
		return Streng;
	
		
		
	}

	// c)
	
	
	public static int summer(int[] tabell) {
		
		int sumFor = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sumFor += tabell [i];
			
		}
		
		System.out.println(sumFor);
		
		int sumWhile = 0;
		
		int index = 0;
		
		while(index <tabell.length) {
			sumWhile += tabell[index];
			index++;
		
		}
		System.out.println(sumWhile);
		
		int sumEach = 0;
		for (int e : tabell) {
			sumEach += e;
		
		}
		System.out.println(sumEach);
		return sumFor;
	}

	
	
	// d)
	
	
	public static boolean finnesTall(int[] tabell, int tall) {

		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		
		return false;
			
	}

	// e)
	
	
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell[i] == tall) {
				
				return i;
			}
			
		}
		return -1;
	

	}

	// f)
	
	
	public static int[] reverser(int[] tabell) {

		int nyTabell[] = new int[tabell.length];
		
		for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j-- ) {
		
			nyTabell[i] = tabell[j];
			
		}
		skrivUt(nyTabell);
		
		return nyTabell;
	}

	// g)
	
	
	public static boolean erSortert(int[] tabell) {

		 
		for(int i = 0; i < tabell.length-1; i++) {
	           
			 if (tabell[i] > tabell[i+1]) {
	                
				return false;
	            }

	        }
	        return true;

	}
	

	// h)
	
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		    
	
		int nyLengde = tabell1.length + tabell2.length;
		int[]komboTabell = new int[nyLengde];
		int teller = 0;

		// loop {1,2,3} inn
		for(int i = 0; i < tabell1.length; i++) {
		        komboTabell [i] = tabell1[i];
		        teller++;

		    }

		    // loop {4,5,6} inn
		    for(int k = 0; k < tabell2.length; k++) {
		        komboTabell [teller] = tabell2[k];
		        teller++;

		    }

		    // loop tabell1 + tabell2
		    for(int j = 0; j < komboTabell.length; j++) {
		        System.out.print(komboTabell[j] + " ");

		    }


		   return komboTabell;
		    }
		
		
		
	
}
