/**
 * 
 */
package cartes.cartes_action.cartes_action_effet;

import origine.Origine;
import cartes.cartes_action.CarteAction;

/**
 * @author Lallement
 *
 */
public class CartesActionEffet extends CarteAction {
	
	/* ---------- Attributs ---------- */
	/**
	 * Intitul� de la carte
	 */
	private String intituleCarte;
	
	
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CartesActionEffet() {
		super();
	}

	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement cr��e
	 */
	public CartesActionEffet(Origine origine) {
		super(origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut intituleCarte
	 * @return {String} intituleCarte : retourne l'intitull� de la carte
	 */
	public String getIntituleCarte() {
		return this.intituleCarte;
	}

	/**
	 * Modificateur pour l'attribut intituleCarte
	 * @param {String} intituleCarte : nouvel intuitul� pour la carte
	 */
	public void setIntituleCarte(String intituleCarte) {
		this.intituleCarte = intituleCarte;
	}
	
	/* ---------- M�thodes ---------- */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
