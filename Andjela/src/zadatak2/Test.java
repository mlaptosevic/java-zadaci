package zadatak2;

public class Test {

	public static void main(String[] args) {
		
		Tacka a=new Tacka(2, 5);
		Tacka b=new Tacka(3, 4);
		Tacka c=new Tacka(5, 10);
		

		Trougao trougao=new Trougao(a, b, c);
		
		boolean postoji=TrougaoProvera.daLiPostoji(trougao);
		System.out.println(postoji);
		
		
		boolean potojiJednakostranican=TrougaoProvera.daLiJeJednakostranican(trougao);
		System.out.println(potojiJednakostranican);
		
		
		Tacka x=new Tacka(0, 0);
		Tacka y=new Tacka(6 , 0);
		Tacka z=new Tacka(0, 8);
		
		Trougao jednakostranican=new Trougao(x, y, z);
		
		System.out.println(TrougaoProvera.daLiJeJednakostranican(jednakostranican));
		
		System.out.println(TrougaoProvera.daLiJePravougli(jednakostranican));
		
	}

}
