package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import java.util.ArrayList;

import origine.Origine;
import effets.Effet;

/** 
 * @author Lallement
 * La classe CarteInfluence decrit le comportement general des cartes Influence
 */
public class CarteInfluence extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteInfluenceJour
	 */
	private String typeInfluence = "Nulle";
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet de s'assurer que les informations permettant l'identification d'une carte soient fournies
	 */
	private CarteInfluence() {}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 * @param {String} type : cha�ne de caract�re permettant d'identifier la carte influence
	 */
	public CarteInfluence(Origine origine, String type) {
		super(origine);
		this.typeInfluence = type;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut typeInfluence
	 * @return {String} typeInfluence : retourne une cha�ne de caract�res permettant d'identifier la carte Influence 
	 */
	public String getTypeInfluence() {
		return this.typeInfluence;
	}

	/**
	 * Modificateur pour l'attribut typeInfluence
	 * @param {String} typeInfluence : type de la carte Influence
	 */
	public void setTypeInfluence(String typeInfluence) {
		this.typeInfluence = typeInfluence;
	}

	/* ---------- Methodes ---------- */
	/**
	 * Impl�mentation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		switch (this.typeInfluence) {
		case "Jour":
			// TODO appliquer effet pour Influence jour
			break;
		case "Nuit":
			// TODO appliquer effet pour Influence n
			break;
		case "Neant":
			// TODO appliquer effet pour Influence neant
			break;
		default:
			// TODO appliquer effet pour Influence nulle
			break;
		}
	}
	
	/**
	 * M�thode retournant toutes les cartes influence
	 * @return {ArrayList<CarteInfluence>} influences : retourne un ArrayList contenant toutes les influences
	 */
	public static ArrayList<CarteInfluence> getAllInfluence() {
		ArrayList<CarteInfluence> influences = new ArrayList<CarteInfluence>();
		influences.add(new CarteInfluence(null, "Jour"));
		influences.add(new CarteInfluence(null, "Nuit"));
		influences.add(new CarteInfluence(null, "Neant"));
		influences.add(new CarteInfluence());
		influences.add(new CarteInfluence());
		return influences;
	}
	
	/**
	 * M�thode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CarteInfluence> testInfluence = CarteInfluence.getAllInfluence();
		for (int i = 0; i < testInfluence.size(); i++) {
			System.out.println(testInfluence.get(i).getTypeInfluence());
		}
	}
}