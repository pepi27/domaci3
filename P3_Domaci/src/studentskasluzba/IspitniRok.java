package studentskasluzba;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IspitniRok {

	protected int id;
	protected String naziv; 
	protected Date pocetak, kraj;
	
	protected static ArrayList<IspitnaPrijava> ispitniRokImaPrijavljeneIspitnePrijave = new ArrayList<>();

	
	public IspitniRok() {
		
	}
	
	public IspitniRok(String tekst) throws ParseException {
		String[] tokeni = tekst.split(",");
		id = Integer.parseInt(tokeni[0]);
		naziv = tokeni[1];
		DateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		pocetak = sdf.parse(tokeni[2]);
		kraj = sdf.parse(tokeni[3]);
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

	public Date getPocetak() {
		return pocetak;
	}

	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}

	public Date getKraj() {
		return kraj;
	}

	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}

	public ArrayList<IspitnaPrijava> getIspitniRokImaPrijavljeneIspitnePrijave() {
		return ispitniRokImaPrijavljeneIspitnePrijave;
	}

	public void setIspitniRokImaPrijavljeneIspitnePrijave(
			ArrayList<IspitnaPrijava> ispitniRokImaPrijavljeneIspitnePrijave) {
		this.ispitniRokImaPrijavljeneIspitnePrijave = ispitniRokImaPrijavljeneIspitnePrijave;
	}

	@Override
	public String toString() {
		return "IspitniRok [id=" + id + ", naziv=" + naziv + ", pocetak=" + pocetak + ", kraj=" + kraj + "]";
	}
	
	
}
