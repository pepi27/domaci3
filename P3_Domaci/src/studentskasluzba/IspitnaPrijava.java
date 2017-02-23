package studentskasluzba;

import java.util.ArrayList;

public class IspitnaPrijava {

	protected int teorija, zadaci;
	protected Student studenta;
	protected Predmet predmet;
	protected IspitniRok ispitniRok;
	
	public IspitnaPrijava() {}
	
	public IspitnaPrijava(String text, ArrayList<Student> lista, ArrayList<Predmet>listaP, ArrayList<IspitniRok> listaIP) {
		String[] tokeni = text.split(",");
		
		
		studenta = TestStudentskaSluzba.pratragaStudenta(lista , (Integer.parseInt(tokeni[0])));
		predmet = TestStudentskaSluzba.pratragaPredmeta(listaP, (Integer.parseInt(tokeni[1])));
		ispitniRok = TestStudentskaSluzba.pretragaIR(listaIP, (Integer.parseInt(tokeni[2])));
		teorija = Integer.parseInt(tokeni[3]);
		zadaci = Integer.parseInt(tokeni[4]);
		
		Student.svePrijave.add(this);
		Predmet.predmetimaPrijavljeneIspitnePrijave.add(this);
		IspitniRok.ispitniRokImaPrijavljeneIspitnePrijave.add(this);
		
	}
	

	

	public int getTeorija() {
		return teorija;
	}

	public void setTeorija(int teorija) {
		this.teorija = teorija;
	}

	public int getZadaci() {
		return zadaci;
	}

	public void setZadaci(int zadaci) {
		this.zadaci = zadaci;
	}

	public Student getStudenta() {
		return studenta;
	}

	public void setStudenta(Student studenta) {
		this.studenta = studenta;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public IspitniRok getIspitniRok() {
		return ispitniRok;
	}

	public void setIspitniRok(IspitniRok ispitniRok) {
		this.ispitniRok = ispitniRok;
	}

	@Override
	public String toString() {
		return "IspitnaPrijava: Student" + studenta + "\n iz predeta: " + predmet + " imao je iz teorije: " + teorija  + " i iz zadataka: " + zadaci + "\n u ispitnom roku" + ispitniRok;  
	}
}
