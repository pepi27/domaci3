package apoteka;

import java.util.Date;

public class Narudzbenica {

	Lek lek;
	Dobavljac dobavljac;
	Date datum; 
	double cena; 
	Apotekar porucilac;
	
	public Narudzbenica() {}
	
	public Narudzbenica(Lek lek, Apotekar porucilac, Date datum, Dobavljac dobavljac) {
		this.lek = lek; 
		this.dobavljac = dobavljac; 
		this.datum = datum;
		this.porucilac = porucilac;
	}

	public Dobavljac getDobavljac() {
		return dobavljac;
	}

	public void setDobavljac(Dobavljac dobavljac) {
		this.dobavljac = dobavljac;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	public Apotekar getPorucilac() {
		return porucilac;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public void setPorucilac(Apotekar porucilac) {
		this.porucilac = porucilac;
	}

	public Lek getLek() {
		return lek;
	}

	public void setLek(Lek lek) {
		this.lek = lek;
	}

	@Override
	public String toString() {
		return "Lek = " + lek + "\nDobavljac = " + dobavljac 
		 	+ "\nDatum = " + datum + "\nCena = " + cena 
			+ "\nPorucilac = " + porucilac;
	}

	
}
