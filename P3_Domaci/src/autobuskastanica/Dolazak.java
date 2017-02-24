package autobuskastanica;

public class Dolazak {

	static int idCounter; 
	private int id; 
	private Autobus autobus; 
	private Peron peron; 
	private String vreme; 
	
	public Dolazak() {};
	
	public Dolazak(String text) {
		idCounter++;
		id = idCounter;
		vreme = text; 
	}

	public Autobus getAutobus() {
		return autobus;
	}

	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}

	public Peron getPeron() {
		return peron;
	}

	public void setPeron(Peron peron) {
		this.peron = peron;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}
	
	public int getId() {
		return id; 
	}

	@Override
	public String toString() {
		return "Dolazak autobusa | " + autobus + ", vreme=" + vreme;
	}
	
	
}
