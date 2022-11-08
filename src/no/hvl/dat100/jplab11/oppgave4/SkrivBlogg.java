package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean funker = false;
		
		PrintWriter skriver = null;
		
		try {
			skriver = new PrintWriter(mappe + "/" + filnavn);
			
			skriver.print(samling.toString());
		}
		catch (FileNotFoundException e) {
			funker = false;
		}
		finally {
			if (skriver != null)
				
				skriver.close();
			funker = true;
		}
		return funker;
	}
}
