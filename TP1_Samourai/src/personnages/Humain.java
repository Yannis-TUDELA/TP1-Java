package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String pNom, int pArgent, String pBoisson) {
		this.nom = pNom;
		this.argent = pArgent;
		this.boisson = pBoisson;
	}
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		this.parler("Mmmm, un verre de " + this.boisson + " ! GLOUPS !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	
	public int gagnerArgent(int gain) {
		return this.argent += gain;
	}
	
	public int perdreArgent(int perte) {
		return this.argent -= perte;
	}
}
