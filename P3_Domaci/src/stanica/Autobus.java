package stanica;

import java.util.Date;

public class Autobus {

	private String registarskiBroj;
	private Prevoznik prevoznik;
	private Tip tip = new Tip();
	

	public Autobus() {
	}

	public Autobus(String tekst) {
		String[] tokeni = tekst.split(",");

		if (tokeni.length < 1) {
			System.out.println("Greska pri ocitavanju autobusa " + tekst);
			// izlazak iz aplikacije
			System.exit(0);
		}

		registarskiBroj = tokeni[0];

		tip.setId(Integer.parseInt(tokeni[1].trim()));

		switch (tip.getId()) {
		case 1:
			tip.setNaziv("Jednospratni");
			break;
		case 2:
			tip.setNaziv("Dvospratni");
			break;
		case 3:
			tip.setNaziv("Minibus");
			break;
		default:
			tip.setNaziv("Obican");
			break;
		}
	}

	public String getRegistarskiBroj() {
		return registarskiBroj;
	}

	public Prevoznik getPrevoznik() {
		return prevoznik;
	}

	public void setRegistarskiBroj(String registarskiBroj) {
		this.registarskiBroj = registarskiBroj;
	}

	public void setPrevoznik(Prevoznik prevoznik) {
		this.prevoznik = prevoznik;
	}

	public Tip getTip() {
		return tip;
	}

	@Override
	public String toString() {
		return "Autobus [registarskiBroj=" + registarskiBroj + ", prevoznik=" + prevoznik.getNaziv() + " tip autobusa "
				+ getTip().getNaziv() + "]";
	}

}
