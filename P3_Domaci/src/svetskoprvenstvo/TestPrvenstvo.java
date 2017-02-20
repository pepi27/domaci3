package svetskoprvenstvo;

import java.util.ArrayList;

public class TestPrvenstvo {
	
	public static void main(String[] args) {
		
		Drzava Spanija = new Drzava(1, "Spanija");
		Drzava Italija = new Drzava(2, "Italija");
		Drzava Francuska = new Drzava(3, "Francuska");
		Drzava Rusija = new Drzava(4, "Rusija"); 
		Drzava Nemacka = new Drzava(5, "Nemacka"); 
		ArrayList<Drzava> domacin = new ArrayList<>();
		domacin.add(Rusija); 
		domacin.add(Italija);
		Prvenstvo Rusija2018 = new Prvenstvo(2018, "Rusija2018", domacin , Nemacka);
		
		System.out.println("Sledece prvenstvo je : " + Rusija2018.toString());
	}
	
	
	
}
