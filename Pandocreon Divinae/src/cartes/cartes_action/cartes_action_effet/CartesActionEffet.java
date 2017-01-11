/**
 * 
 */
package cartes.cartes_action.cartes_action_effet;

import java.util.ArrayList;

import origine.Origine;
import cartes.Carte;
import cartes.cartes_action.CarteAction;
import cartes.cartes_action.cartes_action_effet.carte_deus_ex.CarteDeusEx;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;
import effets.Effet;

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
	
	/**
	 * True si un carte peut �tre sacrifiee
	 * False sinon
	 */
	private boolean sacrifiable = true;
	
	/**
	 * Effet de la carte
	 */
	private Effet effet;

	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur priv� par d�faut
	 */
	public CartesActionEffet() {}
	
	/**
	 * Constructeur avec argument
	 * @param {String} intitule : intitule de la carte
	 */
	public CartesActionEffet(String intitule) {
		super();
		this.intituleCarte = intitule;
	}

	/**
	 * Constructeur avec deux arguments
	 * @param {Origine} origine : origine a attribuer � la carte nouvellement creee
	 * @param {String} intitule : intitule de la carte nouvellement creee
	 * @param {Effet} effet : effet correspondant a la carte nouvellement creee
	 */
	public CartesActionEffet(Origine origine, String intitule, Effet effet) {
		super(origine);
		this.intituleCarte = intitule;
		this.effet = effet;
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
	
	/**
	 * Accesseur pour l'attribut sacrifiable 
	 * @return {boolean} isSacrifiable : true si la carte est sacrifiable, false sinon
	 */
	public boolean isSacrifiable() {
		return this.sacrifiable;
	}

	/**
	 * Modificateur pour l'attribut sacrifiable
	 */
	public void setSacrifiable() {
		this.sacrifiable = (this.sacrifiable) ? false : true;
	}

	/**
	 * Accesseur pour l'attribut effet
	 * @return {Effet} effet : effet de la carte
	 */
	public Effet getEffet() {
		return this.effet;
	}

	/**
	 * Modificateur pour l'attribut effet
	 * @param {Effet} effet : effet a attribuer a la carte
	 */
	public void setEffet(Effet effet) {
		this.effet = effet;
	}

	/* ---------- M�thodes ---------- */
	/**
	 * M�thode permettant d'obtenir toutes les cartes action
	 * @return {ArrayList<Carte>} cartesActionEffet : retourne un ArrayList contenant toutes les cartes actions possedant un effet de sacrifice
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> cartesActionEffet = new ArrayList<Carte>();
		cartesActionEffet.addAll(CarteActionDogmatique.getAll());
		cartesActionEffet.addAll(CarteDeusEx.getAll());
		return cartesActionEffet;
	}
	
	/**
	 * Methode permettant de sacrifier une carte
	 */
	public void sacrifier() {
		if (this.sacrifiable) {
			this.effet.appliquerEffet();
			this.defausser();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
