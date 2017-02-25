package autobuskastanica;

public class Polazak {

	static int idCounter; 
	private int id; 
	private Autobus autobus; 
	private Peron peron; 
	private String vreme; 
	
	public Polazak() {};
	
	public Polazak(String text) {
		idCounter++; 
		id = idCounter;
		String[] tokeni = text.split(",");
		
		autobus = TestStanica.pronadjiAutobusID((tokeni[0]));
	    peron = TestStanica.nadjiPeronID(Integer.parseInt(tokeni[1]));
		vreme = tokeni[2]; 
		
		peron.getPolasciSaPerona().add(this);
		autobus.getPolasciAutobusa().add(this);
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
		return "Polazak [id=" + id + ", peron=" + peron + ", vreme=" + vreme + "]";
	}

	
	
	
}
