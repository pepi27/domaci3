package apoteka;

import java.util.ArrayList;
import java.util.Date;

public class TestApoteka {

	// Izlistavanje svih entiteta
	public static void izlistajApotekare(ArrayList<Apotekar> sviApotekari) {}
	
	public static void izlistajDobavljace(ArrayList<Dobavljac> sviDobavljaci) {}
	
	public static void izlistajNarudzbenice(ArrayList<Narudzbenica> sveNarudzbenice) {}
	
	public static void izlistajLekove(ArrayList<Lek> sviLekovi) {}
	
	public static Narudzbenica kreirajNarudzbenicu(Lek lek, Dobavljac dob, Apotekar ap, int kolicina) {

		Narudzbenica na = new Narudzbenica(lek, ap, new Date(), dob);
		na.setCena(lek.getCena() * kolicina);
		return na; 
	}
	
	public static void naruciLek(int kolicina, Lek lek, Apotekar porucilac) {
		
		
		System.out.println("Narucen je : " + lek.getNaziv() + " x " + kolicina);
		System.out.println("Narudzbenica : \n" + kreirajNarudzbenicu(lek, lek.getDobavljac(), porucilac, kolicina).toString());
		System.out.println();
	}

	// ---------  MAIN  ------------
	public static void main(String[] args) {
		
		Apotekar Petar = new Apotekar(1, "Petar", "Petrovic", "060 000 111");
		Dobavljac Farmakom = new Dobavljac(1, "Farmakom", "Bulevar Oslobodjenja 123", "Novi Sad", "021 345 543");
		Dobavljac Hemofarm = new Dobavljac(2, "Hemofarm", "Futoska 23", "Novi Sad", "021 123 321");
		Lek Ibuprofen = new Lek(1, 642, "Ibuprofen", Farmakom); 
		Lek Paracetamol  = new Lek(2, 550, "Paracetamol", Hemofarm); 
		Lek Aspirin = new Lek(3, 732, "Aspirin", Farmakom);

		naruciLek(3, Aspirin, Petar);
		naruciLek(7, Paracetamol, Petar); 
	}
}
