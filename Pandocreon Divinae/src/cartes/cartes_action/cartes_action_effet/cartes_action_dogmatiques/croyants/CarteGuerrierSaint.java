package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteGuerrierSaint decrit le comportement de la carte GuerriersSaint
 */
public class CarteGuerrierSaint extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteGuerrierSaint() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private CarteGuerrierSaint(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 4);
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteGuerrierSaintHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteGuerrierSaint instance = new CarteGuerrierSaint(new Dogme[]{Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteGuerriersSaints
	 * @return {CarteGuerriersSaints} instance : retourtne l'instance de la classe CarteGuerriersSaints
	 */
	public final static CarteGuerrierSaint getInstance() {
		return CarteGuerrierSaintHolder.instance;
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