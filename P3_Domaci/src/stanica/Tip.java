package stanica;

public class Tip {
	private int id; 
	private String naziv; 
	
	public Tip() {}
	
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
		return "Tip [id=" + id + ", tip autobusa =" + naziv + "]";
	}
	
	
	
}
