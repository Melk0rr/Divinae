/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Brewalen.
 * Cette classe est un singleton
 */
public class Brewalen extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Brewalen
	 */
	private static volatile Brewalen instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Brewalen() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Brewalen(Dogme[] dogmes) {
		super("Brewalen", Origine.JOUR, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Brewalen
	 * @return {Brewalen} instance : retourtne l'instance de la classer Brewalen
	 */
	public final static Brewalen getInstance() {
		if (Brewalen.instance == null) {
			synchronized (Brewalen.class) {
				if (Brewalen.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.HUMAIN, Dogme.MYSTIQUES};
					Brewalen.instance = new Brewalen(dogmes);
				}
			}
		}
		return Brewalen.instance;
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
