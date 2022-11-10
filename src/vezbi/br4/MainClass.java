package vezbi.br4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int brojNaFrlanja;
		
		Brojach brPismo = new Brojach();
		Brojach brGlava = new Brojach();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Vnesi broj na frlanja na parichka: ");
		brojNaFrlanja = sc.nextInt();
		
		while (brojNaFrlanja > 0) {
			brPismo.reset();
			brGlava.reset();
			
			for(int i=0; i<brojNaFrlanja; i++)
			{
				if(Math.random() < 0.5)
					brPismo.zgolemi();
				else
					brGlava.zgolemi();
			}
		System.out.println("Vo " + brojNaFrlanja + " frlanja");
		System.out.println("Padnaa: " + brPismo.brojach + " pisma");
		System.out.println("Padnaa: " + brGlava.brojach + " glavi");
		
		System.out.println("Dokolku sakash povtorno frlanje na parichkata, vnesi povtorno broj na frlanja: ");
		brojNaFrlanja = sc.nextInt();
		
		}
		sc.close();
	}
}
