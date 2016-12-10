package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;

/**
 * @author alexis
 * @author Lallement
 * La classe CarteDeusEx decrit le comportement general des cartes Deus Ex
 */
public class CarteDeusEx extends CartesActionEffet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteDeusEx() {
		super();
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	public CarteDeusEx(Origine origine) {
		super(origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Methodes ---------- */
	/**
	 * M�thode permettatn de r�cup�rer toutes les cartes Deus Ex
	 * @return {ArrayList<CarteDeusEx>} deusEx : retourne un ArrayList contenant toutes les cartes DeusEx
	 */
	public static ArrayList<CarteDeusEx> getAllDeusEx() {
		ArrayList<CarteDeusEx> deusEx = new ArrayList<CarteDeusEx>();
		deusEx.add(CarteBouleversement.getInstance());
		deusEx.addAll(CarteColereDivine.getAllColeresDivines());
		deusEx.add(CarteConcentration.getInstance());
		deusEx.add(CarteDiversion.getInstance());
		deusEx.add(CarteFourberie.getInstance());
		deusEx.addAll(CarteInfluence.getAllInfluence());
		deusEx.add(CarteInquisition.getInstance());
		deusEx.add(CarteMiroir.getInstance());
		deusEx.add(CarteOrdreCeleste.getInstance());
		deusEx.add(CartePhoenix.getInstance());
		deusEx.add(CarteStase.getInstance());
		deusEx.add(CarteTranse.getInstance());
		deusEx.add(CarteTrouNoir.getInstance());
		return deusEx;
	}
	
	/**
	 * M�thode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
