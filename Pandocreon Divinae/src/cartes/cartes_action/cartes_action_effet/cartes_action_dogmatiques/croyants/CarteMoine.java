/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteMoine d�crit le comportement g�n�ral des cartes Moine
 */
public class CarteMoine extends CarteCroyant implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteMoine() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteMoine(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 2);
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- M�thodes ---------- */
	/**
	 * Impl�mentation de la m�thode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode retournant toutes les cartes moines
	 * @return {ArrayList<CarteMoine>} divinites : retourne un ArrayList contenant tous les moines
	 */
	public static ArrayList<CarteMoine> getAllMoines() {
		ArrayList<CarteMoine> moines = new ArrayList<CarteMoine>();
		moines.add(new CarteMoine(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		return moines;
	}

	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}