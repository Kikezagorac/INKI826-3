package vezbi.br3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String golemina="GB";
	
	public PC () {
		this.memorija = 3;
		this.tipNaMemorija = "DDR4";
		this.hardDisk = 240;
	}
	
	public void prvMetod(int zgolemiMemorija, int novHardDisk){
		System.out.println("Memorijata beshe " + this.memorija + golemina + ", sega iznesuva " + (zgolemiMemorija + memorija) + golemina + ".");
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
		System.out.println("HD ima golemina od " + novHardDisk + golemina + ". Prethodno iznesuvashe " + this.hardDisk + golemina + ".");
	}
}
