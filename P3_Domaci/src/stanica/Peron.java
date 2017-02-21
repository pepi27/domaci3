package stanica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Peron {
	
    private int id; 
    private Date polazak ; 
    private Date dolazak ;
    private Stanica stanica = new Stanica();
    private ArrayList<Autobus> pristaliAutobusi = new ArrayList<>();
    
    public Peron() {}
    
    public Peron(String text) throws ParseException {
    	String[] tokeni = text.split(",");
		if (tokeni.length < 3) {
			System.out.println("Greska pri ocitavanju stanice " + text);
			// izlazak iz aplikacije
			System.exit(0);
		}

		id = Integer.parseInt(tokeni[1]);
		DateFormat df = new SimpleDateFormat("hh:mm");
		dolazak = df.parse(tokeni[2].trim());
		polazak = df.parse(tokeni[3].trim());
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPolazak() {
		return polazak;
	}

	public void setPolazak(Date polazak) {
		this.polazak = polazak;
	}

	public Date getDolazak() {
		return dolazak;
	}

	public void setDolazak(Date dolazak) {
		this.dolazak = dolazak;
	}
	
	

	public Stanica getStanica() {
		return stanica;
	}

	public void setStanica(Stanica stanica) {
		this.stanica = stanica;
	}

	@Override
	public String toString() {
		return "Peron [id=" + id + ", dolazi u = " + getDolazak() + ", polazi u = " + getPolazak() + "]";
	}
    
    
}
