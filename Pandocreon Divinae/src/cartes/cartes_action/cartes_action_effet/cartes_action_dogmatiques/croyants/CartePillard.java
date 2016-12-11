package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CartePillard decrit le comportement de la carte Pillards
 */
public class CartePillard extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CartePillard() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private CartePillard(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 4);
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CartePillardHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CartePillard instance = new CartePillard(new Dogme[]{Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CartePillard
	 * @return {CartePillard} instance : retourtne l'instance de la classe CartePillard
	 */
	public final static CartePillard getInstance() {
		return CartePillardHolder.instance;
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
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}