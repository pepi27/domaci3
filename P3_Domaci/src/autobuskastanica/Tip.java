package autobuskastanica;

import java.util.ArrayList;

public class Tip {

	private int id; 
	private String naziv;
	
	public Tip(){}

	public Tip(int id, String naziv) {
		this.id = id;
		this.naziv = naziv;
	}
	
	public Tip(String tekst){
		String [] tokeni = tekst.split(",");
		
		if(tokeni.length!=2){
			System.out.println("Greska pri ocitavanju predmeta " + tekst);
			//izlazak iz aplikacije
			System.exit(0);
		}
		
		id = Integer.parseInt(tokeni[0]);
		naziv = tokeni[1];
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

	@Override
	public String toString() {
		return "Tip [id=" + id + ", naziv=" + naziv + "]";
	}
	
	
}
