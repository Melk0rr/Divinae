/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Gorna.
 * Cette classe est un singleton
 */
public class Gorna extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Gorna() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Gorna(Dogme[] dogmes) {
		super("Gorna", Origine.CREPUSCULE, dogmes);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class GornaHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Gorna instance = new Gorna(GornaHolder.getDogmes());
		
		/**
		 * Methode permettant d'obtenir les dogmes de la divinite
		 * @return {Dogme[]} : tableau de dogmes
		 */
		private static Dogme[] getDogmes() {
			return new Dogme[]{Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS};
		}
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Gorna
	 * @return {Gorna} instance : retourtne l'instance de la classe Gorna
	 */
	public final static Gorna getInstance() {
		return GornaHolder.instance;
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
