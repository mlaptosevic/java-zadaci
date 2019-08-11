package zadatak3;

public class Osoba {
	
	private String imePrezime;
	private String jmbg;
	
	public Osoba(String imePrezime, String jmbg) {
		
		this.imePrezime=imePrezime;
		this.jmbg=jmbg;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public String getJmbg() {
		return jmbg;
	}
	
	public String toString() {
		return "Ime i prezime: "+imePrezime+" Jmbg: "+jmbg;
	}
	
	
	
	
	
	

}
