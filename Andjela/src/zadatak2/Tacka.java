package zadatak2;


public class Tacka {
	
	private int x;
	private int y;
	
	public Tacka(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	public String toString() {
		return "x-"+x+" y-"+y;
	}
	
	public boolean equals(Object o) {
		
		if(!(o instanceof Tacka)) {
			return false;
		}
		
		Tacka tacka= (Tacka) o;
		if(tacka.x==x && tacka.y==y) {
			return true;
		}
		return false;
		
	}
	
	public static double rastojanjeIzmedjuTacaka(Tacka a, Tacka b) {
		
		double rastojanje=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
		return rastojanje;
		
	}

}
