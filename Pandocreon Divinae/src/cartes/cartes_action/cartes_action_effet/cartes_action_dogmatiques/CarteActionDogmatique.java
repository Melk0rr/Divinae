/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;
import dogme.Dogme;

/**
 * @author Lallement
 *
 */
public abstract class CarteActionDogmatique extends CartesActionEffet {
	
	/* ---------- Attributs ---------- */
	private Dogme[] dogmes;
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur par d�faut
	 */
	public CarteActionDogmatique() {
		super();
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement cr��e
	 */
	public CarteActionDogmatique(Origine origine) {
		super(origine);
	}

	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement cr��e
	 * @param {Dogme[]} dogmes : tableau de dogmes � attribuer � la carte
	 */
	public CarteActionDogmatique(Origine origine, Dogme[] dogmes) {
		super(origine);
		this.dogmes = dogmes;
	}
	
	/* ---------- M�thodes ---------- */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}