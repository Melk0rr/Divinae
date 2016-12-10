/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Shingva.
 * Cette classe est un singleton
 */
public final class Shingva extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Shingva
	 */
	private static volatile Shingva instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Shingva() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Shingva(Dogme[] dogmes) {
		super("Shingva", Origine.AUBE, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Shingva
	 * @return {Shingva} instance : retourtne l'instance de la classer Shingva
	 */
	public final static Shingva getInstance() {
		if (Shingva.instance == null) {
			synchronized (Shingva.class) {
				if (Shingva.instance == null) {
					Dogme[] dogmes = {Dogme.HUMAIN, Dogme.MYSTIQUES, Dogme.CHAOS};
					Shingva.instance = new Shingva(dogmes);
				}
			}
		}
		return Shingva.instance;
	}
	
	/* ---------- M�thodes ---------- */
	
	/**
	 * Impl�mentation de la m�thode appliquerEffet
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant � la classe.
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
