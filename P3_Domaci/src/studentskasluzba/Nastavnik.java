package studentskasluzba;

import java.util.ArrayList;

public class Nastavnik {

	protected int id; 
	protected String ime, prezime, zvanje; 
	
	protected ArrayList<Predmet> nastavnikPredajePredmete = new ArrayList<>();
	
	public Nastavnik() {}
	
	public Nastavnik(int id, String ime, String prezime, String zvanje) {
		
		this.id = id; 
		this.ime = ime; 
		this.prezime = prezime;
		this.zvanje = zvanje; 
	}
	
	public Nastavnik(int id, String ime, String prezime, String zvanje, ArrayList<Predmet> nastavnikPredajePredmete) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.zvanje = zvanje;
		this.nastavnikPredajePredmete = nastavnikPredajePredmete;
	}

	//konstruktor koji popunjava podatke na osnovu oÄ?itanog teksta iz fajla nastavnik.csv
		public Nastavnik(String tekst){
			String [] tokeni = tekst.split(",");
			//npr. 		1, Petar, Petrovic, Docent
			//tokeni 	0	 1		 2		  3		
			
			if(tokeni.length!=4){
				System.out.println("Greska pri ocitavanju nastavnika "+tekst);
				//izlazak iz aplikacije
				System.exit(0);
			}
			
			id = Integer.parseInt(tokeni[0]);
			ime = tokeni[1];
			prezime = tokeni[2];
			zvanje = tokeni[3];
		}

		@Override
		public String toString() {
			return "Nastavnik [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", zvanje=" + zvanje + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public String getPrezime() {
			return prezime;
		}

		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}

		public String getZvanje() {
			return zvanje;
		}

		public void setZvanje(String zvanje) {
			this.zvanje = zvanje;
		}

		public ArrayList<Predmet> getNastavnikPredajePredmete() {
			return nastavnikPredajePredmete;
		}

		public void setNastavnikPredajePredmete(ArrayList<Predmet> nastavnikPredajePredmete) {
			this.nastavnikPredajePredmete = nastavnikPredajePredmete;
		}
		
		
}
