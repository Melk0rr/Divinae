/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_apocalypse;

import java.util.ArrayList;

import joueur.Joueur;
import origine.Origine;
import cartes.Carte;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;
import effets.Effet;
import effets.EffetApocalypse;

/**
 * @author Lallement
 *
 */
public class CarteApocalypse extends CartesActionEffet {
	/* ---------- Attributs ---------- */
	/**
	 * Possibilit� de poser une carte apocalypse.
	 * True: une carte apocalypse peut �tre pos�e
	 * False sinon 
	 */
	private boolean etatApocalypse = false;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut prive
	 * On s'assure que les informations necessaires soient renseignees
	 */
	private CarteApocalypse() {
		super();
	}

	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer la carte apocalypse
	 */
	public CarteApocalypse(Origine origine) {
		super(origine, "Apocalypse", new EffetApocalypse());
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
	 * M�thode permettant d'obtenir toutes les cartes apocalypse
	 * @return {ArrayList<Carte>} apocalypses : retourne un ArrayList contenant toutes les cartes apocalypse
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> apocalypses = new ArrayList<Carte>();
		apocalypses.add(new CarteApocalypse(Origine.JOUR));
		apocalypses.add(new CarteApocalypse(Origine.NUIT));
		apocalypses.add(new CarteApocalypse(Origine.NEANT));
		apocalypses.add(new CarteApocalypse(null));
		apocalypses.add(new CarteApocalypse(null));
		return apocalypses;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Carte> testApocalypse = CarteApocalypse.getAll();
		System.out.println(testApocalypse.size());
		System.out.println(testApocalypse.toString());
		for (Carte carteApocalypse : testApocalypse) {
			System.out.println(carteApocalypse.getOrigineCarte());
		}
	}

}
