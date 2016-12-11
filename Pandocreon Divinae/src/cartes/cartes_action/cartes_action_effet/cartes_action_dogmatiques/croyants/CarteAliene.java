package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteAliene decrit le comportement general des cartes Alienes
 */
public class CarteAliene extends CarteCroyant implements Effet {
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteAliene() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteAliene(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 2);
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- M�thodes ---------- */
	/**
	 * Implementation de la m�thode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode retournant toutes les cartes alienes
	 * @return {ArrayList<CarteAliene>} divinites : retourne un ArrayList contenant tous les alienes
	 */
	public static ArrayList<CarteAliene> getAllAlienes() {
		ArrayList<CarteAliene> alienes = new ArrayList<CarteAliene>();
		alienes.add(new CarteAliene(new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}));
		alienes.add(new CarteAliene(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}));
		alienes.add(new CarteAliene(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		return alienes;
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}