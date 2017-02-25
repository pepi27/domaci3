package autobuskastanica;

import java.util.ArrayList;


public class Peron {

	private int id; 
	private ArrayList<Polazak> polasciSaPerona = new ArrayList<>(); 
	private ArrayList<Dolazak> dolasciNaPeron = new ArrayList<>(); 
	
	private Stanica stanica; 
	
	public Peron(){}
	
	public Peron(String tekst) {
		
		String [] tokeni = tekst.split(",");

		id = Integer.parseInt(tokeni[0]);
		stanica = TestStanica.sveStanice.get(Integer.parseInt(tokeni[1].trim()) - 1);
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

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Peron [id=" + id + "]";
	}


}
