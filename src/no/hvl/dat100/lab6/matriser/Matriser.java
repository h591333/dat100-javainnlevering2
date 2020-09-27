package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main (String[] args) {
		int [][] matrise = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(tilStreng(matrise));
		
	}
		
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] test : matrise) {
			System.out.println();
			for (int i : test) {
			System.out.print(i + " ");
				
			 }
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String utskrift = "";
        for(int[] rad : matrise) {
        	System.out.println();
        	for(int pos : rad) {
        	System.out.print(pos + " ");
        	
        	}
        }
        utskrift += ("");
		return utskrift;
		
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMat = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < nyMat.length; i++) {
			
			for (int j = 0; j < nyMat[i].length; j++) {
				
				nyMat[i][j] = matrise[i][j] * tall;
				
			}
		}
		
		return nyMat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		int rad1, kollone1, rad2, kollone2;
		
		boolean flag = true;
	
	
		int tabell[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			
		};
		 int tabell2[][] = {       
                 {1, 2, 3},    
                 {4, 5, 6},    
                 {7, 8, 9}    
    	};    
		
		
		rad1 = a.length;
		kollone1 = a[0].length;
		
		rad2 = b.length;
		kollone2 = b[0].length;
		
		if (rad1 != rad2 || kollone1 != kollone2) {
			System.out.println("Matrisene er ikke like");
		
		} else {
			
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kollone1; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			
			if (flag)
				System.out.println("Matrisene er like");
			else
				System.out.println("Matrisene er ikke like");
		}
			
		return flag;

		
	}
	
	// e) ikke gjort
	//public static int[][] speile(int[][] matrise) {
	// f) ikke gjort
	//public static int[][] multipliser(int[][] a, int[][] b) {

}
