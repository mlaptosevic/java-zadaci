package zadatak3;

public class Menadzer extends Osoba{
	
	
	public final static int MAX_RADNIKA=10;
	Radnik[] radnici=new Radnik[MAX_RADNIKA];
	int brojac=0;
	public final static double SATNICA_RT=7;
	public final static double SATNICA_P=4.5;
	
	
	public Menadzer(String imePrezime, String jmbg) {
		super(imePrezime, jmbg);
	}
	
	public void dodajRadnika(Radnik r) {
		
		if(brojac==radnici.length) {
			System.out.println("Greska! Dostignut kapacitet!");
			return;
		}
		
		if(r.getSpecijalnost()==Specijalnost.DOSTAVA) {
			System.out.println("Greska!");
				return;
			}
		
		radnici[brojac++]=r;
		
	}
	
	public String toString() {
		
		String menadzer=super.toString();
		StringBuilder build=new StringBuilder();
		build.append(menadzer);
		build.append("\nRadnici:");
		for(int i=0; i<brojac; i++) {
			build.append("\n\t"+radnici[i].toString());
		}
		
		return build.toString();
	
	}

	public double izracunajPlate() {
		
		double ukupnaPlata=0;
		for(int i=0; i<brojac; i++) {
			switch(radnici[i].getSpecijalnost()) {
			
			case RADNIK_NA_TERENU:
				ukupnaPlata+=radnici[i].getBrojRadnihSati()*SATNICA_RT;
				break;
				
			case PRODAVAC:
				ukupnaPlata+=radnici[i].getBrojRadnihSati()*SATNICA_P;
				break;
			
			default: System.out.println("Greska!");
			                       
			}
		}
		
		return ukupnaPlata;
			
	}
}
