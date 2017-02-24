package autobuskastanica;

import java.util.ArrayList;

public class Stanica {
	private int id;
	private String sediste;
	private ArrayList<Peron> peroni = new ArrayList<>();

	public Stanica() {
	}

	public Stanica(int id, String sediste, ArrayList<Peron> peroni) {
		this.id = id;
		this.sediste = sediste;
		this.peroni = peroni;
	}

	public Stanica(String text) {

		String[] tokeni = text.split(",");

		if (tokeni.length < 2) {
			System.out.println("Greska pri ocitavanju perona " + text);
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

	public ArrayList<Peron> getPeroni() {
		return peroni;
	}

	public void setPeroni(ArrayList<Peron> peroni) {
		this.peroni = peroni;
	}

	@Override
	public String toString() {
		return "Stanica broj " + id + ", sediste=" + sediste + ", ima perone=" + peroni;
	}

	
	
}
