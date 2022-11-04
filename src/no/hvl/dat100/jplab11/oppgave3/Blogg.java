package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	protected Innlegg[] innleggTab;
	protected int nesteledig;
	// TODO: objektvariable

	public Blogg() {

		innleggTab = new Innlegg[20];

	}

	public Blogg(int lengde) {

		innleggTab = new Innlegg[lengde];
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

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledig && !funnet) {
			if (innleggTab[pos].erLik(innlegg)) {
				funnet = true;
			} else {
				pos++;
			}
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}

	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean funnet = false;
		
		if (finnInnlegg(innlegg) == -1) {
			return funnet;
		} else {
			funnet = true;
			return funnet;
		}
		
	}

	public boolean ledigPlass() {
		
		if (nesteledig < innleggTab.length) {
			return true;
		} else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		
		if (ny && nesteledig < innleggTab.length) {
			innleggTab[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}
		
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