package zadatak3;

public class Radnik extends Osoba {

	private Specijalnost specijalnost;
	private int brojRadnihSati;
	
	
	
	public Specijalnost getSpecijalnost() {
		return specijalnost;
	}

	public void setSpecijalnost(Specijalnost specijalnost) {
		this.specijalnost = specijalnost;
	}

	public int getBrojRadnihSati() {
		return brojRadnihSati;
	}

	public void setBrojRadnihSati(int brojRadnihSati) {
		this.brojRadnihSati = brojRadnihSati;
	}

	public Radnik(String imePrezime, String jmbg, Specijalnost specijalnost, int brojRadnihSati) {

		super(imePrezime, jmbg);
		this.specijalnost=specijalnost;
		this.brojRadnihSati=brojRadnihSati;
		
	}
	
	public String toString() {
		
	String osoba=super.toString();
	
	return osoba+" Specijalnost: "+specijalnost+" Broj radnih sati: "+brojRadnihSati;
	
		
	}
}
