package autobuskastanica;

import java.util.HashSet;
import java.util.Set;

public class Prevoznik {
	static int idCounter; 
	private int id;
	private String naziv, sediste;
	public Set<Autobus> sviAutobusiPrevoznika = new HashSet<>();

	public Prevoznik() {}

	public Prevoznik(int id, String naziv, String sediste) {
		this.id = id; 
		this.naziv = naziv;
		this.sediste = sediste;
		
	}
	
	public Prevoznik(String text) {
		String[] tokeni = text.split(",");
		idCounter++; 
		id = idCounter; 
		naziv = tokeni[0];
		sediste = tokeni[1];

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public void setSediste(String sediste) {
		this.sediste = sediste;
	}
	
	public Set<Autobus> getSviAutobusiPrevoznika() {
		return sviAutobusiPrevoznika;
	}

	public void setSviAutobusiPrevoznika(Set<Autobus> sviAutobusiPrevoznika) {
		this.sviAutobusiPrevoznika = sviAutobusiPrevoznika;
	}

	@Override
	public String toString() {
		return "Prevoznik id=" + id + ", naziv=" + naziv + ", sediste=" + sediste + "\nAutobusi " + sviAutobusiPrevoznika;
	}

	
	
	

}
