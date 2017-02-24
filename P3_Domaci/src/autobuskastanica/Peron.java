package autobuskastanica;

import java.util.ArrayList;


public class Peron {

	private int id; 
	private ArrayList<Polazak> polasciSaPerona = new ArrayList<>(); 
	private ArrayList<Dolazak> dolasciNaPeron = new ArrayList<>(); 
	private ArrayList<Autobus> autobusi = new ArrayList<>();
	private Stanica stanica; 
	
	public Peron(){}
	
	public Peron(String tekst) {
		
		String [] tokeni = tekst.split(",");

		id = Integer.parseInt(tokeni[0]);
		
		Dolazak d = TestStanica.pronadjiDolazak(tokeni[1].trim());
		dolasciNaPeron.add(d);
		
		Polazak p = TestStanica.pronadjiPolazak(tokeni[2].trim());
		polasciSaPerona.add(p);

		Autobus a = TestStanica.pronadjiAutobusID(tokeni[3].trim());
		autobusi.add(a);
		
		a.getPolasciAutobusa().add(p);
		a.getDolasciAutobusa().add(d);
		
		d.setAutobus(a);
		d.setPeron(this);
		p.setAutobus(a);
		p.setPeron(this);
		
		stanica = TestStanica.sveStanice.get(Integer.parseInt(tokeni[4].trim()) - 1);
		stanica.getPeroni().add(this);
		
		
	}

	public int getId() {
		return id;
	}

	public Stanica getStanica() {
		return stanica;
	}

	public void setStanica(Stanica stanica) {
		this.stanica = stanica;
	}

	public ArrayList<Polazak> getPolasciSaPerona() {
		return polasciSaPerona;
	}

	public void setPolasciSaPerona(ArrayList<Polazak> polasciSaPerona) {
		this.polasciSaPerona = polasciSaPerona;
	}

	public ArrayList<Dolazak> getDolasciNaPeron() {
		return dolasciNaPeron;
	}

	public void setDolasciNaPeron(ArrayList<Dolazak> dolasciNaPeron) {
		this.dolasciNaPeron = dolasciNaPeron;
	}

	public ArrayList<Autobus> getAutobusi() {
		return autobusi;
	}

	public void setAutobusi(ArrayList<Autobus> autobusi) {
		this.autobusi = autobusi;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nPeron broj : " + id + " | autobusi=" + autobusi ;
	}
	
	
}
