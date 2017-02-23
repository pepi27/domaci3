package apoteka;

import java.util.ArrayList;


public class TestApoteka {
	
	
	
	// Unesi entitete 
	
	public static void unesiApotekare(ArrayList<Apotekar> lista) {
		String unos = "1, Petar, Petrovic, 060/200-100\n"
			        + "2, Jovan, Jovanovic, 060/300-100\n"
				    ;
		
		String [] sviRedovi = unos.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Apotekar(sviRedovi[i]));
		}
	}
	
	public static void unesiDobavljace(ArrayList<Dobavljac> lista) {
		String unos = "1, Hemofarm, Hemofarmska 25, Vrsac, 0800-Hemofarm\n"
			        + "2, Farmakom, Farmakomska 27, Novi Beograd, 0800-Farmakom\n"
				    ;
		
		String [] sviRedovi = unos.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Dobavljac(sviRedovi[i]));
		}
	}
	
	public static void unesiLekove(ArrayList<Lek> lista) {
		String unos = "1, Ibuprofen\n"
				    + "2, Paracetamol\n"
				    + "3, Andol\n"
				    + "4, Vitamin C\n"
				    ;
		
		String [] sviRedovi = unos.split("\n");
		for(int i = 0; i < sviRedovi.length; i++) {
			lista.add( new Lek(sviRedovi[i]));
		}
	}

	// Izlistavanje svih entiteta
	public static <T> void izlistajListu(ArrayList<T> svi) {
		for(T t : svi) {
			System.out.println(t.toString());
		}
	}
	
	public static void izlistajNarudzbenice(ArrayList<Narudzbenica> sveNarudzbenice) {}
	
	public static Apotekar pronadjiApotekara(ArrayList<Apotekar> lista, int id){
		Apotekar retVal = null;
		for (int i = 0; i < lista.size(); i++) {
			Apotekar ap = lista.get(i);
			if (ap.getId() == id) {
				retVal = ap;
				break;
			}
		}
		return retVal;
	}
	
	public static Dobavljac pronadjiDobavljaca(ArrayList<Dobavljac> lista, int id) {
		Dobavljac retVal = null;
		for(int i = 0; i < lista.size(); i++) {
			Dobavljac d = lista.get(i);
			if(d.getId() == id) {
				retVal = d; 
				break; 
			}
		}
		return retVal;
	}

	// ---------  MAIN  ------------
	public static void main(String[] args) {
		
		ArrayList<Apotekar> apotekari = new ArrayList<>();
		ArrayList<Dobavljac> dobavljaci = new ArrayList<>();
		ArrayList<Lek> lekovi = new ArrayList<>();
		ArrayList<NarucenaStavka> stavke = new ArrayList<>();
		ArrayList<Narudzbenica> narudzbenice = new ArrayList<>();
		
		unesiApotekare(apotekari);
		unesiDobavljace(dobavljaci);
		unesiLekove(lekovi);
		unesiStavke(stavke, lekovi);
		unesiNarudzbenice(narudzbenice, apotekari, dobavljaci, stavke);
		
		System.out.println("Svi apotekari");
        izlistajListu(apotekari);
		System.out.println();
		System.out.println("Svi dobavljaci");
        izlistajListu(dobavljaci);
		System.out.println();
		System.out.println("Svi lekovi");
		izlistajListu(lekovi);
		System.out.println();
		System.out.println("Sve narudzbenice");
		izlistajListu(narudzbenice);
		System.out.println();
		System.out.println("Sve stavke");
		izlistajListu(stavke);
		System.out.println();

	}

	private static void unesiStavke(ArrayList<NarucenaStavka> listaN, ArrayList<Lek> listL) {
		String tekst = "1, 200, 5, 2\n"
					 + "2, 430, 4, 1\n"
					 + "3, 55.30, 100, 4\n"
				;
		String[] sviRedovi = tekst.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			listaN.add(new NarucenaStavka(sviRedovi[i], listL));
		}
	}

	private static void unesiNarudzbenice(ArrayList<Narudzbenica> narudzbenice, ArrayList<Apotekar> listA, ArrayList<Dobavljac> listD, ArrayList<NarucenaStavka> sveStavke) {
		String test = 
				     "1,3000,1,2\n"
				+    "2,5000,2,1\n"
				;
		String[] sviRedovi = test.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			Narudzbenica na = new Narudzbenica(sviRedovi[i], listA, listD);
			na.setStavke(sveStavke);
			narudzbenice.add(na);
			
		}
	}

	public static Lek pronadjiLek(ArrayList<Lek> sviLekovi, int id) {
		Lek retVal = null;
		for(int i = 0; i < sviLekovi.size(); i++) {
			Lek l = sviLekovi.get(i);
			if(l.getId() == id) {
				retVal = l; 
				break; 
			}
		}
		return retVal;
	}

	public static Narudzbenica pronadjiNarudzbenicu(ArrayList<Narudzbenica> lista, int id) {
		Narudzbenica retVal = null;
		for(int i = 0; i < lista.size(); i++) {
			Narudzbenica na = lista.get(i);
			if(na.getId() == id) {
				retVal = na; 
				break; 
			}
		}
		return retVal;
	}

	
}
