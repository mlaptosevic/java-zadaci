package zadatak2;

public class TrougaoProvera {
	
	
	public static boolean daLiPostoji(Trougao trougao) {
		
		if( trougao.getA().equals(trougao.getB())
				|| trougao.getB().equals(trougao.getC())
	|| trougao.getC().equals(trougao.getA()))
			return false;
		return true;
			
	}
	
	public static boolean daLiJeJednakostranican(Trougao trougao) {
		
		Tacka a = trougao.getA();
		Tacka b = trougao.getB();
		Tacka c = trougao.getC();
		
		if ( Tacka.rastojanjeIzmedjuTacaka(a, b) == Tacka.rastojanjeIzmedjuTacaka(b, c)
				&& Tacka.rastojanjeIzmedjuTacaka(a, b) == Tacka.rastojanjeIzmedjuTacaka(a, c))
			return true;
		
		return false;
	}
	
	public static boolean daLiJePravougli(Trougao trougao) {
		
		double duzinaA=Tacka.rastojanjeIzmedjuTacaka(trougao.getA(), trougao.getB());
		double duzinaB=Tacka.rastojanjeIzmedjuTacaka(trougao.getB(), trougao.getC());
		double duzinaC=Tacka.rastojanjeIzmedjuTacaka(trougao.getA(), trougao.getC());
		
		System.out.println(duzinaA + " " + duzinaB + " " + duzinaC);
		
		if(duzinaA>duzinaB && duzinaA>duzinaC) {
			if(duzinaA*duzinaA==(duzinaB*duzinaB+duzinaC*duzinaC)) return true;
			else return false;
		}
		if(duzinaB>duzinaA && duzinaB>duzinaC) {
			if(duzinaB*duzinaB==(duzinaA*duzinaA+duzinaC*duzinaC)) return true;
			else return false;
			
		}
		if(duzinaC>duzinaB && duzinaC>duzinaA) {
			if(duzinaC*duzinaC==(duzinaB*duzinaB+duzinaA*duzinaA)) return true;
			else return false;
			
		}
		return false;
		
		
		
			
		 
		    
			
			
		
		
	}

}
