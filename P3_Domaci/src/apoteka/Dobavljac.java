package apoteka;

public class Dobavljac {

	protected int id; 
	protected String naziv, adresa, mesto, brojTelefona;
	
	public Dobavljac() {}
	
	public Dobavljac(int id, String naziv, String adresa, String mesto, String brojTelefona) {
		this.id = id;
		this.naziv = naziv;
		this.adresa = adresa;
		this.mesto = mesto;
		this.brojTelefona = brojTelefona;
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	@Override
	public String toString() {
		return "Dobavljac [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", mesto=" + mesto
				+ ", brojTelefona=" + brojTelefona + "]";
	} 

	
	
}
