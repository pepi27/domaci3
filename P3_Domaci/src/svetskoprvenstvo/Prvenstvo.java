package svetskoprvenstvo;

import java.util.ArrayList;

public class Prvenstvo {

	// Sifra
	protected int godinaOdrzavanja;

	protected String naziv;
	protected ArrayList<Drzava> domacin = new ArrayList<>();
	protected Drzava osvajac;

	public Prvenstvo() {
	}

	public Prvenstvo(int godinaOdrzavanja, String naziv, ArrayList<Drzava> domacin, Drzava osvajac) {
		this.godinaOdrzavanja = godinaOdrzavanja;
		this.naziv = naziv;
		this.domacin = domacin;
		this.osvajac = osvajac;
	}

	public ArrayList<Drzava> getDomacin() {
		return domacin;
	}

	public void setDomacin(ArrayList<Drzava> domacin) {
		this.domacin = domacin;
	}

	public int getGodinaOdrzavanja() {
		return godinaOdrzavanja;
	}

	public void setGodinaOdrzavanja(int godinaOdrzavanja) {
		this.godinaOdrzavanja = godinaOdrzavanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Drzava getOsvajac() {
		return osvajac;
	}

	public void setOsvajac(Drzava osvajac) {
		this.osvajac = osvajac;
	}

	@Override
	public String toString() {
		return "Prvenstvo godinaOdrzavanja= " + godinaOdrzavanja + ", naziv=" + naziv + ", domacin(i)=" + domacin
				+ ", osvajac=" + osvajac;
	}
	
	

}
