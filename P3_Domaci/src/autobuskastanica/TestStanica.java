package autobuskastanica;

import java.util.ArrayList;


public class TestStanica {
	
	public static ArrayList<Tip> sviTipovi = new ArrayList<>(); 
	public static ArrayList<Peron> sviPeroni = new ArrayList<>(); 
	public static ArrayList<Stanica> sveStanice = new ArrayList<>(); 
	public static ArrayList<Polazak> sviPolasci = new ArrayList<>(); 
	public static ArrayList<Dolazak> sviDolasci = new ArrayList<>(); 
	public static ArrayList<Autobus> sviAutobusi = new ArrayList<>(); 
	public static ArrayList<Prevoznik> sviPrevoznici = new ArrayList<>(); 

	public static <T> void ispisiListu(ArrayList<T> lista) {
		for(T t : lista) {
			System.out.println(t.toString());
		}
	}
	
	// UCITAVANJE PODATAKA
	
	private static void ucitajDolaske() {
	    // autobus , peron , vreme
	    String text = "BG-111-222,1,07:50\n"
		     	    + "BG-111-333,1,08:10\n"
			        + "NI-222-333,1,08:30\n"
			        + "NI-222-444,2,08:50\n"
			        + "NS-222-444,3,09:10\n"
			        + "BG-111-222,3,13:30\n"
			        ;
		String[] sviRedovi = text.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			sviDolasci.add(new Dolazak(sviRedovi[i]));
		}
	}
	
	private static void ucitajPolaske() {
		String text = "BG-111-222,1,08:00\n"
			    	+ "BG-111-333,1,08:20\n"
			    	+ "NI-222-333,2,08:40\n"
			    	+ "NI-222-444,1,09:00\n"
			    	+ "NS-222-444,1,08:00\n"
			    	+ "NI-222-444,3,12:40\n"
			    	;	
		String[] sviRedovi = text.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			sviPolasci.add(new Polazak(sviRedovi[i]));
		}
	}
	
	public static void ucitajPodatkePeron(ArrayList<Peron> lista) {
               //    id, dolazak, polazak, autobus, stanica		
		String text = "1,1\n"
					+ "2,1\n"
				    + "3,1\n";
		
		String [] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Peron(sviRedovi[i]));
		}
	}
	
	
	
	public static void ucitajPodatkeTipAutobusa() {
		// Sadrzaj csv fajla koji cuva podatke o tipovima autobusa
		String text = "1,Jednospratni\n" 
		            + "2,Dvospratni\n" 
				    + "3,Minibus\n";
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			sviTipovi.add(new Tip(sviRedovi[i]));
		}
	}
	
	public static void ucitajPodatkeStanica() {
		String text = "1, Beograd\n"
				    ;
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			sveStanice.add(new Stanica(sviRedovi[i]));
		}
	}
	
	public static void ucitajPodatkeAutobusa(ArrayList<Autobus> lista) {
		//   regostracija, prevoznik, tipautobusa
		String text = "BG-111-222, 1, 1\n"
					+ "BG-111-333, 1, 2\n"
					+ "NI-222-333, 2, 1\n"
					+ "NI-222-444, 2, 3\n"
					+ "NS-222-444, 1, 3\n"
					;
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Autobus(sviRedovi[i]));
		}
	}
	
	public static void ucitajPodatkePrevoznici(ArrayList<Prevoznik> lista) {
		String text = "BAS,Beograd\n"
				    + "MAS,Novi Sad\n";
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Prevoznik(sviRedovi[i]));
		}
	}
	
	
	// ########## MAIN METHOD ############
	public static void main(String[] args) {
	
		ucitajPodatkeTipAutobusa();
		ucitajPodatkePrevoznici(sviPrevoznici);
		ucitajPodatkeAutobusa(sviAutobusi);
		ucitajPodatkeStanica();
		ucitajPodatkePeron(sviPeroni);
		ucitajPolaske();
		ucitajDolaske();
		System.out.println("\n#### STANICE ####");
		ispisiListu(sveStanice);
		System.out.println("\n#### PERONI ####\n");
		ispisiListu(sviPeroni);
		System.out.println("\n#### TIP AUTOBUSA ####");
		ispisiListu(sviTipovi);
		System.out.println("\n#### POLASCI ####");
		ispisiListu(sviDolasci);
		System.out.println("\n#### DOLASCI ####");
		ispisiListu(sviPolasci);
		System.out.println("\n#### PREVOZNICI ####");
		ispisiListu(sviPrevoznici);
		System.out.println("\n#### AUTOBUSI ####");
		ispisiListu(sviAutobusi);
		
	}


	public static Prevoznik pronadjiPrevoznikaID(int id) {
		Prevoznik retObj = null;
		for (int i = 0; i < sviPrevoznici.size(); i++) {
			Prevoznik p = sviPrevoznici.get(i);
			if(p.getId() == id) {
				retObj = p; 
			}
		}
		return retObj;
	}

	public static Tip pronadjiTipAutobusaID(int id) {
		Tip retObj = null;  
		for (int i = 0; i < sviTipovi.size(); i++) {
			Tip tip = sviTipovi.get(i);
			if (tip.getId() == id) {
				retObj = tip;
				break;
			}
		}
		return retObj;
	}

	public static Peron nadjiPeronID(int id) {
		Peron retObj = null; 
		for(int i = 0; i < sviPeroni.size(); i++) {
			Peron peron = sviPeroni.get(i);
			if(peron.getId() == id) {
				retObj = peron; 
				break; 
			}
		}
		return retObj;
	}

	public static Dolazak pronadjiDolazak(String dolazakTekst) {
        Dolazak retObj = null;
        for (int i = 0; i < sviDolasci.size(); i++) {
			Dolazak dolazak = sviDolasci.get(i);

			if(dolazak.getVreme().equals(dolazakTekst)) {
				retObj = dolazak;
				break;
			} 
			
		}
		return retObj;
	}

	public static Polazak pronadjiPolazak(String polazakTekst) {
		Polazak retVal = null;
		for (int i = 0; i < sviPolasci.size(); i++) {
			Polazak st = sviPolasci.get(i);
			if (st.getVreme().equals(polazakTekst)) {
				retVal = st;
				break;
			} 
		}
		return retVal;
	}

	public static Autobus pronadjiAutobusID(String registracija) {
		Autobus retVal = null; 
		for (int i = 0; i < sviAutobusi.size(); i++) {
			Autobus a = sviAutobusi.get(i);
			if(a.getRegistracija().equals(registracija)) {
				retVal = a; 
			}
		}
		return retVal;
	}
}

