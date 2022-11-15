package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String pNom, int pArgent) {
		super(pNom, pArgent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argentExtorquer = super.getArgent();
		perdreArgent(argentExtorquer);
		parler("Le monde est vraiment trop injuste");
		return argentExtorquer;
	}
	
	public void recevoir(int pArgent) {
		super.gagnerArgent(pArgent);
		parler("Merci!!");
	}
}
