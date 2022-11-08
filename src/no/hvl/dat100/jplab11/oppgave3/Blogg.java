package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTab;
	private int nesteledig;
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
		
		while (pos < innleggTab.length && !funnet) {
			if (innleggTab[pos] == null) {
				return -1;
			} else if (innleggTab[pos].erLik(innlegg)) {
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
		
        if (finnInnlegg(innlegg) == -1)
            return false;
        else
            return true;
		
	}

	public boolean ledigPlass() {
		
		if (nesteledig < innleggTab.length) {
			return true;
		} else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnes(innlegg);
		
		if (!ny && ledigPlass()) {
			innleggTab[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}
		
	}

	public String toString() {
		
		String str = nesteledig + "\n";
		
		for (int pos = 0; pos < nesteledig; pos++) {
			
			str += innleggTab[pos].toString();
			
		}
		return str;
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