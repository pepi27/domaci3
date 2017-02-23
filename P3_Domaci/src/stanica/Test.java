package stanica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;


public class Test {
	
	
	private static void izlistajSveAutobuse(ArrayList<Autobus> lista) {
		for(Autobus a : lista) {
			System.out.println(a.toString());
		}
	}
	
	private static void izlistajSvePrevoznike(ArrayList<Prevoznik> lista) {
		for(Prevoznik pr : lista) {
			System.out.println(pr.toString());
		}
	}
	
	private static void ucitajSveAutobuse(ArrayList<Autobus> lista, ArrayList<Tip> tipovi) {
		String text = "BG 123-123, 1\n"
			    + "BG 123-124, 2\n"
			    + "BG 123-125, 3\n"
			    + "NI 321-321, 1\n"
			    + "NI 234-234, 2\n"
			    + "NI 234-255, 3\n"
		            + "NS 333-111, 1\n"
		            + "NS 444-222, 2\n"
             		    + "NS 444-333, 3\n";
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			Autobus a = new Autobus(sviRedovi[i]);
			lista.add(a);
			tipovi.add(a.getTip());
		}
	}
	
	private static void ucitajSvePrevoznike(ArrayList<Prevoznik> lista) {
		String text = "1,Lasta Beograd, Beograd\n"
			    	+ "2,Nis Ekspres, Nis\n"
			    	+ "3,SEVERTRANS, Novi Sad\n";
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			lista.add(new Prevoznik(sviRedovi[i]));
		}
	}

	private static void ucitajPodatkePrevozi(ArrayList<Prevoznik> prevoznici, ArrayList<Autobus> autobusi) {

		//prevoznici.get(0).getSviAutobusiPrevoznika().add(autobusi.get(0));
		
		String text = "1,BG 123-123\n" 
			    + "1,BG 123-124\n"
			    + "1,NI 321-321\n" 
		            + "1,BG 123-125\n" 
			    + "2,NI 321-321\n"
			    + "2,NI 234-234\n" 
			    + "2,NS 444-333\n" 
			    + "3,NI 234-234\n"
			    + "1,NS 333-111\n"
			    + "2,NS 444-222\n"
			    + "3,NI 234-255\n";
		
			    
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			String[] prevoziPodaciTekst = sviRedovi[i].split(",");
			int idPrevoznika = Integer.parseInt(prevoziPodaciTekst[0]);
			String registracija = prevoziPodaciTekst[1];
			Autobus a = pretragaAutobusa(autobusi, registracija);
			Prevoznik pr = pretragaPrevoznika(prevoznici, idPrevoznika);
			if (a != null && pr != null) {
				a.setPrevoznik(pr);
				pr.getSviAutobusiPrevoznika().add(a);
			}
		}
	}

	private static void ucitajPodatkeStanice(ArrayList<Stanica> sveStanice) {
		String text = "1, Beograd, 1, 2, 3\n"
					 +"2, Novi Sad, 1, 2, 3\n"
			         +"3, Nis, 1, 2, 3\n";
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			sveStanice.add(new Stanica(sviRedovi[i]));
			
		}
	}

	private static Autobus pretragaAutobusa(ArrayList<Autobus> autobusi, String registracija) {
		
			Autobus obj = null; 
			for(Autobus a : autobusi) {
				if(a.getRegistarskiBroj().equals(registracija)) {
					obj = a; 
					break; 
				}
			}
			
			return obj; 
	}
	
	private static Prevoznik pretragaPrevoznika(ArrayList<Prevoznik> prevoznici, int idPrevoznika) {
		
		Prevoznik obj = null; 
		for(Prevoznik a : prevoznici) {
			if(a.getId() == idPrevoznika) {
				obj = a; 
				break; 
			}
		}
		return obj; 
	}
	
	public static void main(String[] args) throws ParseException {
		
		ArrayList<Autobus> sviAutobusi = new ArrayList<>();
		ArrayList<Prevoznik> sviPrevoznici = new ArrayList<>();
		ArrayList<Stanica> sveStanice = new ArrayList<>();
		ArrayList<Peron> sviPeroni = new ArrayList<>();
		ArrayList<Tip> sviTipovi = new ArrayList<>();
		
		ucitajSveAutobuse(sviAutobusi, sviTipovi);
		ucitajSvePrevoznike(sviPrevoznici);
		ucitajPodatkeStanice(sveStanice);
		//ucitajSvePerone(sviPeroni);
		ucitajSvePeroneStanice(sviPeroni, sveStanice);
		ucitajPodatkePrevozi(sviPrevoznici, sviAutobusi);
		
		izlistajSveAutobuse(sviAutobusi);
		izlistajSvePrevoznike(sviPrevoznici);
		izlistajSveStanice(sveStanice);
		izlistajSvePerone(sviPeroni);
		izlistajSveTipove(sviTipovi);
		
	}

	private static void izlistajSveTipove(ArrayList<Tip> sviTipovi) {
		for(Tip tip : sviTipovi) {
			System.out.println(tip.toString());
		}
		
	}

	private static void izlistajSvePerone(ArrayList<Peron> sviPeroni) {
	    for(Peron pe : sviPeroni) {
	    	System.out.println(pe.toString());
	    }
	}

	private static void izlistajSveStanice(ArrayList<Stanica> sveStanice) {
		for(Stanica st : sveStanice) {
			System.out.println(st.toString());
		}
		
	}

	private static void ucitajSvePeroneStanice(ArrayList<Peron> sviPeroni, ArrayList<Stanica> sveStanice) throws ParseException {

		String text = "1,1, 10:00, 10:10\n"
			    + "1,2, 11:00, 11:10\n"
		            + "1,3, 12:00, 12:10\n"
		            + "2,3, 09:20, 09:30\n"
		            + "2,3, 10:20, 10:30\n"
		            + "2,3, 11:20, 11:30\n"
		            + "3,1, 08:15, 08:30\n"
		            + "3,2, 09:15, 09:30\n"
		            + "3,3, 10:15, 10:30\n";
		
		String[] sviRedovi = text.split("\n");
		for (int i = 0; i < sviRedovi.length; i++) {
			
			sviPeroni.add(new Peron(sviRedovi[i]));
			String[] peroniPodaciTekst = sviRedovi[i].split(",");
			int idStanice = Integer.parseInt(peroniPodaciTekst[0]);
			int idPerona = Integer.parseInt(peroniPodaciTekst[1]);
			Stanica st = pretragaStanica(sveStanice, idStanice);
			Peron pe = pretragaPerona(sviPeroni, idPerona);
			if (pe != null && st!= null) {	
				st.getPeroniStanice().add(pe);
				pe.setStanica(st);
			}
			
		}
		
//		String[] sviRedovi = text.split("\n");
//		for (int i = 0; i < sviRedovi.length; i++) {
//			Stanica st = sveStanice.get(Integer.parseInt(sviRedovi[i].substring(0, 1)) - 1);
//			sviPeroni.add(new Peron(sviRedovi[i], st));
//		}
	
		
	}

	private static Peron pretragaPerona(ArrayList<Peron> sviPeroni, int idPerona) {
		Peron obj = null; 
		for(Peron pe : sviPeroni) {
			if(pe.getId() == idPerona) {
				obj = pe; 
				break; 
			}
		}
		return obj; 
	}

	private static Stanica pretragaStanica(ArrayList<Stanica> sveStanice, int idStanice) {
		Stanica obj = null;
		for(Stanica st : sveStanice) {
			if(st.getId() == idStanice) {
				obj = st; 
				break;
			}
		}
		return obj; 
	}
}
