package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String pNom, int pArgent, String pBoisson) {
		super(pNom, pArgent, pBoisson);
	}
	
	public void donner(int n, Commercant c) {
		c.recevoir(n);
		perdreArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		if (this.honneur*2 > y.getReputation()) {
			gagnerArgent(y.getArgent());
			y.perdreDuel();
			honneur += 1;
			parler("J'ai gagné contre " + y.getNom());
		} else {
			honneur -= 1;
			parler("Pfffff, J'ai perdu zebi!"); 
			y.gagnerDuel();
		}
	}
}
