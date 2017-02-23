package apoteka;

public class Apotekar {

	protected int id; 
	protected String ime, prezime, brojTelefona;

	public Apotekar() {}

	public Apotekar(int id, String ime, String prezime, String brojTelefona) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.brojTelefona = brojTelefona;
	}
	
	public Apotekar(String tekst) {
		String[] tokeni = tekst.split(",");
		
		id = Integer.parseInt(tokeni[0]);
		ime = tokeni[1].trim();
		prezime = tokeni[2].trim();
		brojTelefona = tokeni[3].trim();
	}

	@Override
	public String toString() {
		return "\nApotekar sa sifrom: | " + id + " | " + ime + " | " + prezime + " | broj telefona = " + brojTelefona;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getBrojTelefona() {
		return brojTelefona;
	}


	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
}
