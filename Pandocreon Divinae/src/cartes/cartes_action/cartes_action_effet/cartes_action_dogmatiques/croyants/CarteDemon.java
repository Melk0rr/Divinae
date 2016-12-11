package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteDemon decrit le comportement general des cartes Demon
 */
public class CarteDemon extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteDemon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteDemon(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 2);
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
	 * @return {ArrayList<CarteDemon>} divinites : retourne un ArrayList contenant tous les moines
	 */
	public static ArrayList<CarteDemon> getAllDemons() {
		ArrayList<CarteDemon> demons = new ArrayList<CarteDemon>();
		demons.add(new CarteDemon(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}));
		demons.add(new CarteDemon(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		demons.add(new CarteDemon(new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}));
		demons.add(new CarteDemon(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}));
		demons.add(new CarteDemon(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		return demons;
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}