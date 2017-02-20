package svetskoprvenstvo;

public class Drzava {

	protected int id; 
	protected String naziv;
	
	public Drzava() {}
	
	public Drzava(int id, String naziv) {
		this.id = id; 
		this.naziv = naziv; 
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
		return "Drzava [redni broj= " + id + ", naziv= " + naziv + "]";
	} 
	
	
}
