/**
 * 
 */
package cartes.cartes_action.cartes_apocalypse;

import origine.Origine;
import cartes.cartes_action.CarteAction;

/**
 * @author Lallement
 *
 */
public class CarteApocalypse extends CarteAction {
	/* ---------- Attributs ---------- */
	/**
	 * Possibilit� de poser une carte apocalypse.
	 * True: une carte apocalypse peut �tre pos�e
	 * False sinon 
	 */
	private boolean etatApocalypse = false;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteApocalypse() {
		super();
	}

	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer la carte apocalypse
	 */
	public CarteApocalypse(Origine origine) {
		super(origine);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut etatApocalypse
	 * @return {boolean} etatApocalypse : retourne true si une carte apocalypse peut �tre pos�e, false sinon
	 */
	public boolean isEtatApocalypse() {
		return this.etatApocalypse;
	}

	/**
	 * Modificateur pour l'attribut etatApocalypse
	 */
	public void setEtatApocalypse() {
		this.etatApocalypse = (this.etatApocalypse) ? false : true;
	}
	
	/* ---------- M�thodes ---------- */
	
	/**
	 * M�thode d�terminanty l'action � effectuer lorsqu'une carte apocalypse est utilis�e
	 * calcule les points de chaque joueur, puis �limine un joueur ou d�termine un gagnant
	 */
	public void determinerAction() {
		// TODO calcul des points et �limination ou d�termination d'un gagnant
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}