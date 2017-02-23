package apoteka;

public class Lek {

	protected int id;
	protected String naziv;
	
	
	public Lek() {}
	
	public Lek(int id, String naziv) {
		this.id = id;
		
		this.naziv = naziv;
	}
	
	public Lek(String tekst) {
		String[] tokeni = tekst.split(",");
		
		id = Integer.parseInt(tokeni[0]);
		naziv = tokeni[1].trim();
		
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
		return "\nLek sa sifrom: | " + id + " | " + naziv + " |";
		
	} 
	
	
}
