package vezbi.br1;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Opel", "Astra", "Siva", 19600, 2011, "BT-365-UE" );
		
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
