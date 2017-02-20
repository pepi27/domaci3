package apoteka;


public class Apotekar {

	protected int id; 
	protected String ime, prezime, brojTelefona;
	protected Narudzbenica narudzbenica; 
	
	
	
	public Apotekar() {}


	public Apotekar(int id, String ime, String prezime, String brojTelefona) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.brojTelefona = brojTelefona;
	}


	@Override
	public String toString() {
		return "Apotekar [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", brojTelefona=" + brojTelefona
				 + "]";
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


	public Narudzbenica getNarudzbenica() {
		return narudzbenica;
	}


	public void setNarudzbenica(Narudzbenica narudzbenica) {
		this.narudzbenica = narudzbenica;
	}
	
	
}
