/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Yartsur.
 * Cette classe est un singleton
 */
public class Yartsur extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Yartsur() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Yartsur(Dogme[] dogmes) {
		super("Yartsur", Origine.JOUR, dogmes);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class YartsurHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Yartsur instance = new Yartsur(YartsurHolder.getDogmes());
		
		/**
		 * Methode permettant d'obtenir les dogmes de la divinite
		 * @return {Dogme[]} : tableau de dogmes
		 */
		private static Dogme[] getDogmes() {
			return new Dogme[]{Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUES};
		}
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Yartsur
	 * @return {Yartsur} instance : retourtne l'instance de la classer Yartsur
	 */
	public final static Yartsur getInstance() {
		return YartsurHolder.instance;
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
