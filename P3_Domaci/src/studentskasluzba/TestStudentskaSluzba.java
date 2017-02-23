package studentskasluzba;

import java.text.ParseException;
import java.util.ArrayList;

public class TestStudentskaSluzba {

	/*** ISPIS ***/
	public static void ispisiStudente(ArrayList<Student> lista) {
		for (Student st : lista) {
			System.out.println(st.toString());
		}
	}

	public static void ispisiSveOStudentu(Student obj) {
		System.out.println(obj.toStringAll());
	}

	public static void ispisiPredmete(ArrayList<Predmet> lista) {
		for (Predmet pr : lista) {
			System.out.println(pr.toString());
		}
	}

	public static void ispisiSveOPredmetu(Predmet obj) {
		System.out.println(obj.toStringAll());
	}

	public static void ispisiNastavnike(ArrayList<Nastavnik> lista) {
		for (Nastavnik nt : lista)
			System.out.println(nt.toString());
	}

	public static void ispisiSveONastavniku(Nastavnik obj) {
		System.out.println(obj.toString());
	}

	/*** PRETRAGA ***/
	public static Student pratragaStudenta(ArrayList<Student> lista, int id) {
		Student obj = null;
		for (Student st : lista) {
			if (st.id == id) {
				obj = st;
				break;
			}
		}
		return obj;
	}

	public static Predmet pratragaPredmeta(ArrayList<Predmet> lista, int id) {
		Predmet obj = null;
		for (Predmet pr : lista) {
			if (pr.id == id) {
				obj = pr;
				break;
			}
		}
		return obj;
	}
	
	public static Nastavnik pretragaNastavnika(ArrayList<Nastavnik> lista, int id) {
		Nastavnik obj = null; 
		for(Nastavnik na : lista) {
			if(na.id == id) {
				obj = na; 
				break; 
			}
		}
		return obj; 
	}
	
	public static IspitniRok pretragaIR(ArrayList<IspitniRok> lista, int id) {
		IspitniRok obj = null; 
		for(IspitniRok i : lista) {
			if(i.id == id) {
				obj = i; 
				break;
			}
		}
		return obj; 
	}

	/*** DODADVANJE NOVOG ***/
	public static void dodavanjeNovogStudenta(ArrayList<Student> lista) {
		int id;
		String ime;
		String prezime;
		String grad;
		String indeks;

		// dobijanje random id
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaStudenta(lista, id) != null) {
			id = (int) (Math.random() * 10 / Math.random());
		}

		// unošenje podataka o novom studentu
		ime = "StudentNovoIme" + id;
		prezime = "StudentNovoPrezime" + id;
		grad = "StudentNoviGrad" + id;
		indeks = "StudentNoviIndeks" + id;

		Student obj = new Student(id, ime, prezime, grad, indeks);
		lista.add(obj);
	}
	
	public static void dodavanjeNovogNastavnika(ArrayList<Nastavnik> lista) {
		int id;
		String ime;
		String prezime;
		String zvanje; 
		
		// dobijanje random id
		id = (int) (Math.random() * 10 / Math.random());
		while (pretragaNastavnika(lista, id) != null) {
			id = (int) (Math.random() * 10 / Math.random());
		}

		// unošenje podataka o novom studentu
		ime = "NastavnikNovoIme" + id;
		prezime = "NastavnikNovoPrezime" + id;
		zvanje = "NastavnikNovoZvanje" + id; 
		Nastavnik obj = new Nastavnik(id, ime, prezime, zvanje);
		lista.add(obj);
	}

	public static void dodavanjeNovogPredmeta(ArrayList<Predmet> lista) {
		int id;
		String naziv;

		// dobijanje random id
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaPredmeta(lista, id) != null) {
			id = (int) (Math.random() * 10 / Math.random());
		}
		// unošenje podataka o novom predmetu
		naziv = "PredmetNoviNaziv" + id;

		Predmet obj = new Predmet(id, naziv);
		lista.add(obj);
	}

	/*** IZMENA POSTOJEĆEG ***/
	public static void izmenaStudenta(ArrayList<Student> lista) {
		int id;

		// dobijanje random id za izmenu
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaStudenta(lista, id) == null) {
			id = (int) (Math.random() * 10 / Math.random());
		}
		Student obj = pratragaStudenta(lista, id);

		// unošenje podataka o izmenjenom studentu
		obj.setIme("StudentIzmenjenoIme" + id);
		obj.setPrezime("StudentIzmenjenoPrezime" + id);
		obj.setGrad("StudentIzmenjenGrad" + id);
		obj.setIndeks("StudentIzmenjenIndeks" + id);
	}

	public static void izmenaPredmeta(ArrayList<Predmet> lista) {
		int id;

		// dobijanje random id za izmenu
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaPredmeta(lista, id) == null) {
			id = (int) (Math.random() * 10 / Math.random());
		}
		Predmet obj = pratragaPredmeta(lista, id);

		// unošenje podataka o izmenjenom predmetu
		obj.setNaziv("PredmetIzmenjenNaziv" + id);
	}

	/*** BRISANJE POSTOJEĆEG ***/
	public static void brisanjeStudenta(ArrayList<Student> lista) {
		int id;

		// dobijanje random id za brisanje
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaStudenta(lista, id) == null) {
			id = (int) (Math.random() * 10 / Math.random());
		}
		Student obj = pratragaStudenta(lista, id);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).isti(obj)) {
				lista.remove(i);
				break;
			}
		}
	}

	public static void brisanjePredmeta(ArrayList<Predmet> lista) {
		int id;

		// dobijanje random id za brisanje
		id = (int) (Math.random() * 10 / Math.random());
		while (pratragaPredmeta(lista, id) == null) {
			id = (int) (Math.random() * 10 / Math.random());
		}
		Predmet obj = pratragaPredmeta(lista, id);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).isti(obj)) {
				lista.remove(i);
				break;
			}
		}
	}

	/*** UČITAVANJE ***/
	public static void ucitajPodatkeStudent(ArrayList<Student> lista) {
		// Sadrzaj csv fajla koji cuva podatke o studentima
		String text = "1,E1 01/2011,Srđanov,Konstantin,Loznica\n" + "2,E1 02/2012,Baki,Strahinja,Novi Sad\n"
				+ "3,E1 03/2013,Trajković,Nebojša,Inđija\n" + "4,E2 01/2011,Sekulić,Miloš,Vršac\n"
				+ "5,E2 02/2012,Askin,Vuk,Novi Sad\n" + "6,E2 03/2013,Klainić,Marko,Sombor\n"
				+ "7,E2 04/2011,Marko,Panić,Zrenjanin";
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Student(sviRedovi[i]));
		}
	}

	public static void ucitajPodatkePredmet(ArrayList<Predmet> lista) {
		// Sadrzaj csv fajla koji cuva podatke o predmetima
		String text = "1,Matematika\n" + "2,Fizika\n" + "3,Elektrotehnika\n" + "4,Informatika";
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Predmet(sviRedovi[i]));
		}
	}

	public static void ucitajPodatkePohadja(ArrayList<Student> listaSt, ArrayList<Predmet> listaPr) {
		// Sadrzaj csv fajla koji cuva podatke o pohađa
		// Uparivanje objekata se ostvaruje na osnovu identifikatora ID
		String text =
				// Srđanov Konstantin pohađa Matematiku, Fiziku i Elektrotehniku
				"1,1\n" + "1,2\n" + "1,3\n"
				// Baki Strahinja pohađa Fiziku
						+ "2,2\n"
						// Trajković Nebojša pohađa Matematiku
						+ "3,1\n"
						// Sekulić Miloš pohađa Matematiku,Elektrotehniku i
						// Informatiku
						+ "4,1\n" + "4,3\n" + "4,4\n"
						// Askin Vuk pohađa Matematiku i Fiziku
						+ "5,1\n" + "5,2\n"
						// Klainić Marko pohađa Elektrotehniku
						+ "6,3";
		// Marko Panić ne pohađa ništa, STA ĆEMO SA NJIM????
		// PA NIŠTA :)

		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			String[] pohadjaPodaciTekst = sviRedovi[i].split(",");
			int idStudenta = Integer.parseInt(pohadjaPodaciTekst[0]);
			int idPredmeta = Integer.parseInt(pohadjaPodaciTekst[1]);
			Student st = pratragaStudenta(listaSt, idStudenta);
			Predmet pr = pratragaPredmeta(listaPr, idPredmeta);
			if (st != null && pr != null) {
				st.getPredmeti().add(pr);
				pr.getStudenti().add(st);
			}
		}
	}

	public static void ucitajPodatkeNastavnik(ArrayList<Nastavnik> listaNastavnik) {
		String text = "1, Petar, Petrović, Docent\n" 
				+ "2, Jovan, Jovanović, Docent\n"
				+ "3, Marko, Marković, Asistent\n" 
				+ "4, Nikola, Nikolić, Redovni Profesor\n"
				+ "5, Lazar, Lazić, Asistent\n";

		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			listaNastavnik.add(new Nastavnik(sviRedovi[i]));
		}

	}
	
	public static void ucitajPodatkePredaje(ArrayList<Nastavnik> nastavnici, ArrayList<Predmet> predmeti) {
		String text = "1,1\n" + "1,2\n"
				    + "2,2\n"
				    + "3,2\n" + "3,3\n"
				    + "4,1\n" + "4,3\n"
				    + "5,3\n" + "5,4";
				    
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			String[] pohadjaPodaciTekst = sviRedovi[i].split(",");
			int idNastavnika = Integer.parseInt(pohadjaPodaciTekst[0]);
			int idPredmeta = Integer.parseInt(pohadjaPodaciTekst[1]);
			Nastavnik na = pretragaNastavnika(nastavnici, idNastavnika);
			Predmet pr = pratragaPredmeta(predmeti, idPredmeta);
			if (na != null && pr != null) {
				na.getNastavnikPredajePredmete().add(pr);
				pr.getPredmetPredajuNastavnici().add(na);
			}
		}
	}
	
private static void ucitajPodatkeIspitnePrijave(ArrayList<IspitnaPrijava> svePrijave, ArrayList<Student> sviStudenti, ArrayList<Predmet> sviPredmeti, ArrayList<IspitniRok> sviRokovi) {
		
		String text = "1,1,1,89,98\n" 
		            + "1,2,1,90,73\n"
				    + "2,1,1,78,65\n"
				    + "3,2,1,55,98\n"
				    + "3,4,1,76,82\n"
				;
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			svePrijave.add(new IspitnaPrijava(sviRedovi[i], sviStudenti, sviPredmeti, sviRokovi));
		}
	}

	public static void main(String[] args) throws ParseException {
		ArrayList<Student> sviStudenti = new ArrayList<Student>();
		ArrayList<Predmet> sviPredmeti = new ArrayList<Predmet>();
		ArrayList<Nastavnik> sviNastavnici = new ArrayList<>();
		ArrayList<IspitnaPrijava> svePrijave = new ArrayList<>();
		ArrayList<IspitniRok> sviRokovi = new ArrayList<>();

		ucitajPodatkeStudent(sviStudenti);
		ucitajPodatkePredmet(sviPredmeti);
		ucitajPodatkePohadja(sviStudenti, sviPredmeti);
		ucitajPodatkeNastavnik(sviNastavnici);
		ucitajPodatkePredaje(sviNastavnici, sviPredmeti);
		ucitajPodatkeRokovi(sviRokovi);
		ucitajPodatkeIspitnePrijave(svePrijave, sviStudenti, sviPredmeti, sviRokovi);

		System.out.println("SVI STUDENTI");
		ispisiStudente(sviStudenti);
		System.out.println();
		System.out.println("SVI PREDMETI");
		ispisiPredmete(sviPredmeti);
		System.out.println();
		System.out.println("SVI NASTAVNICI");
		ispisiNastavnike(sviNastavnici);
		System.out.println();
		System.out.println("SVI ROKOVI");
		ispisiRokove(sviRokovi); 
		System.out.println();
		System.out.println("SVE ISPITNE PRIJAVE");
		ispisiIspitnePrijave(svePrijave);
		System.out.println();

		System.out.println("ISPIS DETALJA O STUDENTU Sekulić Miloš sa ID 4");
		Student st = pratragaStudenta(sviStudenti, 4);
		if (st != null) {
			ispisiSveOStudentu(st);
		}
		System.out.println();

		System.out.println("ISPIS DETALJA O PREDMETU Matematici sa ID 1");
		Predmet pr = pratragaPredmeta(sviPredmeti, 1);
		if (pr != null) {
			ispisiSveOPredmetu(pr);
		}
		System.out.println();
		
		System.out.println("ISPIS DETALJA O NASTAVNIKU Petar sa ID 1");
		Nastavnik na = pretragaNastavnika(sviNastavnici, 1);
		if (na != null) {
			ispisiSveONastavniku(na);
		}
		System.out.println();

		System.out.println("DODAVANJE NOVOG STUDENTA");
		dodavanjeNovogStudenta(sviStudenti);
		System.out.println("SVI STUDENTI POSLE DODAVANJA");
		ispisiStudente(sviStudenti);
		System.out.println();

		System.out.println("DODAVANJE NOVOG PREDMETA");
		dodavanjeNovogPredmeta(sviPredmeti);
		System.out.println("SVI PREDMETI POSLE DODAVANJA");
		ispisiPredmete(sviPredmeti);
		System.out.println();
		
		System.out.println("DODAVANJE NOVOG NASTAVNIKA");
		dodavanjeNovogNastavnika(sviNastavnici);
		System.out.println("SVI NASTAVNICI POSLE DODAVANJA");
		ispisiNastavnike(sviNastavnici);
		System.out.println();

		System.out.println("IZMENA 1 STUDENTA");
		izmenaStudenta(sviStudenti);
		System.out.println("SVI STUDENTI POSLE IZMENE");
		ispisiStudente(sviStudenti);
		System.out.println();

		System.out.println("IZMENA 1 PREDMETA");
		izmenaPredmeta(sviPredmeti);
		System.out.println("SVI PREDMETI POSLE IZMENE");
		ispisiPredmete(sviPredmeti);
		System.out.println();

		System.out.println("BRISANJE 1 STUDENTA");
		brisanjeStudenta(sviStudenti);
		System.out.println("SVI STUDENTI POSLE BRISANJA");
		ispisiStudente(sviStudenti);
		System.out.println();

		System.out.println("BRISANJE 1 PREDMETA");
		brisanjePredmeta(sviPredmeti);
		System.out.println("SVI PREDMETI POSLE BRISANJA");
		ispisiPredmete(sviPredmeti);
		System.out.println();

		System.out.println("Zavrsen rad sa konstruktorima");

	}

	private static void ispisiIspitnePrijave(ArrayList<IspitnaPrijava> svePrijave) {
		for(IspitnaPrijava i : svePrijave) {
			System.out.println(i.toString());
		}
		
	}

	private static void ispisiRokove(ArrayList<IspitniRok> sviRokovi) {
		for(IspitniRok r : sviRokovi) {
			System.out.println(r.toString());
		}
		
	}

	private static void ucitajPodatkeRokovi(ArrayList<IspitniRok> sviRokovi) throws ParseException {
		
		String text = 
				"1, Januar, 2017.01.02, 2017.01.05\n"
			  + "2, Jun, 2017.06.01, 2017.06.05\n"
				;
		
		String [] sviRedovi = text.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			sviRokovi.add(new IspitniRok(sviRedovi[i]));
		}
	}

	

}
