package zadatak1;

public class Logika {
	
	public int najveciElement(int[] niz) {
		int najveci=niz[0];
		for(int i=1; i<niz.length; i++) {
			if(niz[i]>najveci) {
				najveci=niz[i];
			}
		}
		return najveci;
			
		
	}
	
	public int[] nizPozitivnihBrojeva(int[] niz) {
		
		int brojPozitivnih=0;
		for(int i=0; i<niz.length; i++) {
			if(niz[i]>0) {
				brojPozitivnih++;
			}	
		}
		
		int[] nizPozitivnih=new int[brojPozitivnih];
		int indeksNizaPB=0;
		for(int i=0; i<niz.length; i++) {
			if(niz[i]>0) {
				nizPozitivnih[indeksNizaPB++]=niz[i];
			}
		}
		
		return nizPozitivnih;
			
		
		
	}
	
	static public  void ispisiNiz(int[] niz) {
		
		for(int element: niz) {
			System.out.println(element);
		}
	}
	
	static public int[] sortirajNiz(int[] niz) {
		for(int j=0; j<niz.length-1; j++) {
		for(int i=0; i<niz.length-1; i++) {
			int pom;
			if(niz[i]>niz[i+1]) {
				pom=niz[i];
				niz[i]=niz[i+1];
				niz[i+1]=pom;
			}
		}
	}
		
		return niz;
				
				
	}
	
	
	public static void main(String[] args) {
		
		int[] niz= {5, 10, 2, -3, 0};
		
		Logika l=new Logika();
		
		System.out.println("Najveci element niza: "+l.najveciElement(niz));
		
		int[] niz1=l.nizPozitivnihBrojeva(niz);
		Logika.ispisiNiz(niz1);
		
		System.out.println();
		int[] niz2=Logika.sortirajNiz(niz);
		Logika.ispisiNiz(niz2);
		
		
		
	}

}
