package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	
	protected Innlegg[] innleggTab;
	protected int nesteledig;
	// TODO: objektvariable 

	public Blogg() {
		
		Blogg blogger = new Blogg(20);
		
	}

	public Blogg(int lengde) {
		
		innleggTab = new Innlegg [lengde];
		nesteledig = 0;
		
	}

	public int getAntall() {

		int antall = this.nesteledig;
        return antall;
        
	}
	
	public Innlegg[] getSamling() {
		
		return innleggTab;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}