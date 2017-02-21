package stanica;

import java.util.ArrayList;

public class Prevoznik {
	
	private int id;
	private String naziv; 
	private String sediste; 
	private ArrayList<Autobus> sviAutobusiPrevoznika = new ArrayList<Autobus>(); 
	
	public Prevoznik(){}
	
	public Prevoznik(String tekst) {
		String [] tokeni = tekst.split(",");
		
		if(tokeni.length!=3){
			System.out.println("Greska pri ocitavanju prevoznika " + tekst);
			//izlazak iz aplikacije
			System.exit(0);
		}
		
		id = Integer.parseInt(tokeni[0]);
		naziv = tokeni[1];
		sediste = tokeni[2];
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

	public ArrayList<Autobus> getSviAutobusiPrevoznika() {
		return sviAutobusiPrevoznika;
	}

	public void setSviAutobusiPrevoznika(ArrayList<Autobus> sviAutobusiPrevoznika) {
		this.sviAutobusiPrevoznika = sviAutobusiPrevoznika;
	}

	@Override
	public String toString() {
		return "Prevoznik [id=" + id + ", naziv=" + naziv + ", sediste=" + sediste + ", sviAutobusiPrevoznika="
				+ sviAutobusiPrevoznika + "]";
	}
	
	
}
