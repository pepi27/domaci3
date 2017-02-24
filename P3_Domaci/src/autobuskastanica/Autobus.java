package autobuskastanica;

import java.util.ArrayList;

public class Autobus {
    
	private String registracija;
    private Prevoznik prevoznik; 
    private Tip tipAutobusa; 
    private ArrayList<Polazak> polasciAutobusa = new ArrayList<>(); 
    private ArrayList<Dolazak> dolasciAutobusa = new ArrayList<>(); 
    
    public Autobus(){}

	public Autobus(String registracija, Prevoznik prevoznik, Tip tipAutobusa) {
		this.registracija = registracija;
		this.prevoznik = prevoznik;
		this.tipAutobusa = tipAutobusa;
	}
	
	public Autobus (String text) {

		String[] tokeni = text.split(",");
		registracija = tokeni[0];
		prevoznik = TestStanica.pronadjiPrevoznikaID(Integer.parseInt(tokeni[1].trim()));
		tipAutobusa = TestStanica.pronadjiTipAutobusaID(Integer.parseInt(tokeni[2].trim()));
		prevoznik.getSviAutobusiPrevoznika().add(this);
		
		
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public Prevoznik getPrevoznik() {
		return prevoznik;
	}

	public void setPrevoznik(Prevoznik prevoznik) {
		this.prevoznik = prevoznik;
	}

	public Tip getTipAutobusa() {
		return tipAutobusa;
	}

	public void setTipAutobusa(Tip tipAutobusa) {
		this.tipAutobusa = tipAutobusa;
	}

	@Override
	public String toString() {
		return "\nAutobus registracija=" + registracija + ", tipAutobusa=" + tipAutobusa;
	}

	public ArrayList<Polazak> getPolasciAutobusa() {
		return polasciAutobusa;
	}

	public void setPolasciAutobusa(ArrayList<Polazak> polasciAutobusa) {
		this.polasciAutobusa = polasciAutobusa;
	}

	public ArrayList<Dolazak> getDolasciAutobusa() {
		return dolasciAutobusa;
	}

	public void setDolasciAutobusa(ArrayList<Dolazak> dolasciAutobusa) {
		this.dolasciAutobusa = dolasciAutobusa;
	}
	
	
}
