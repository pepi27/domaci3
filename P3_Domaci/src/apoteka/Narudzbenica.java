package apoteka;

import java.util.ArrayList;
import java.util.Date;

public class Narudzbenica {

	int id; 
	double ukupnaCena; 
	Date datum; 
	Dobavljac dobavljac;
	Apotekar porucilac;
	ArrayList<NarucenaStavka> stavke = new ArrayList<>();
	
	public Narudzbenica() {}
	
	public Narudzbenica(int id, Apotekar porucilac, Date datum, Dobavljac dobavljac) {
		this.id = id; 
		this.porucilac = porucilac;
		this.datum = datum;
		this.dobavljac = dobavljac; 
	}
	
	public Narudzbenica(String tekst, ArrayList<Apotekar> listaA, ArrayList<Dobavljac> listaD) {
		String[] tokeni = tekst.split(",");
		
		id = Integer.parseInt(tokeni[0]);
		ukupnaCena = Double.parseDouble(tokeni[1]);
		datum = new Date();
		porucilac = TestApoteka.pronadjiApotekara(listaA, Integer.parseInt(tokeni[2])); 
		dobavljac = TestApoteka.pronadjiDobavljaca(listaD, Integer.parseInt(tokeni[3])); 
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

	public void setPorucilac(Apotekar porucilac) {
		this.porucilac = porucilac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public ArrayList<NarucenaStavka> getStavke() {
		return stavke;
	}

	public void setStavke(ArrayList<NarucenaStavka> stavke) {
		this.stavke = stavke;
	}

	@Override
	public String toString() {
		return "\nNarudzbenica sa sifrom: | " + id + " | cena | " + ukupnaCena + " |\n dobavljac : " + dobavljac + " datum | " + datum
				+ " porucilac | " + porucilac + " \nstavke | " + stavke;
	}

	
	
}
