package apoteka;

public class Lek {

	protected int id;
	double cena; 
	protected String naziv;
	Dobavljac dobavljac; 
	
	public Lek() {}
	
	public Lek(int id, double cena, String naziv, Dobavljac dobavljac) {
		this.id = id;
		this.cena = cena;
		this.naziv = naziv;
		this.dobavljac = dobavljac; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Dobavljac getDobavljac() {
		return dobavljac;
	}

	public void setDobavljac(Dobavljac dobavljac) {
		this.dobavljac = dobavljac;
	}

	@Override
	public String toString() {
		return "Lek [id=" + id + ", cena=" + cena + ", naziv=" + naziv + "]";
	} 
	
	
}
