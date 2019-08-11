package zadatak3;

public class Test {
	
	public static void main(String[] args) {
		
		Osoba osoba=new Radnik("Andjela Vucendic","1234",Specijalnost.RADNIK_NA_TERENU, 300);
		
		String ja=osoba.toString();
		System.out.println(ja);
		
		System.out.println("*");
		
		
		
		Menadzer menadzer=new Menadzer("Emilija Djokanovic", "7894");
		
		Radnik radnik=(Radnik) osoba;
		
		menadzer.dodajRadnika(radnik);
		System.out.println(menadzer.toString());
		System.out.println(menadzer.izracunajPlate());
		
		
		
		
		
	}

}
