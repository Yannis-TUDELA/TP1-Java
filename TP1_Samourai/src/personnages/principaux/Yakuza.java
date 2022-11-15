package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String pNom, int pArgent, String pBoisson, String pClan) {
		super(pNom, pArgent, pBoisson);
		this.clan = pClan;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant commercant) {
		super.gagnerArgent(commercant.seFaireExtorquer());
		this.reputation += 1;
		parler("Je viens d'extorquer " + commercant.getNom() + ", j'ai pris " + commercant.getArgent());
		
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		parler("J'ai Gagné le duel!!!!");
	}
	
	public int perdreDuel() {
		this.reputation -= 1;
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("J'ai perdu mon combat :(");
		return argentPerdu;
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " +this.getNom()+ ", je fais parti du clan"	+ this.getClan() + " et j'aime boire du\" +this.getBoisson()");
	}
}
