package stanica;

import java.util.ArrayList;

public class Stanica {
	private int id; 
	private String sediste; 
	private ArrayList<Peron> peroniStanice = new ArrayList<>();
	
	public Stanica() {}
	
	public Stanica(String text) {
		
		String[] tokeni = text.split(",");
		if (tokeni.length < 3) {
			System.out.println("Greska pri ocitavanju stanice " + text);
			// izlazak iz aplikacije
			System.exit(0);
		}

		id = Integer.parseInt(tokeni[0]);
		sediste = tokeni[1];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSediste() {
		return sediste;
	}

	public void setSediste(String sediste) {
		this.sediste = sediste;
	}

	public ArrayList<Peron> getPeroniStanice() {
		return peroniStanice;
	}

	public void setPeroniStanice(ArrayList<Peron> peroniStanice) {
		this.peroniStanice = peroniStanice;
	}

	@Override
	public String toString() {
		return "Stanica [id=" + id + ", sediste=" + sediste + ", peroniStanice=" + peroniStanice.toString() + "]";
	}
	
	
}
