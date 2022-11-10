package vezbi.br2;

public class MainClass {
public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "Fakultet za informatichki i komunikaciski tehnologii";
		f1.brojNaSmerovi = 3;
		f1.brojNaStudenti = 200;
		f1.dekan = "Aleksandar Markoski";
		f1.sediste = "Bitola";
		
		f1.prvMetod();
		System.out.println("Namalen broj studenti: " + f1.vtorMetod(50));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "Tehnichki fakultet";
		f2.brojNaSmerovi = 7;
		f2.brojNaStudenti = 450;
		f2.dekan = "Mitko Kostov";
		f2.sediste = "Bitola";
		
		f2.prvMetod();
		System.out.println("Namalen broj studenti: " + f2.vtorMetod(30));
		f2.tretMetod();
	}
}
