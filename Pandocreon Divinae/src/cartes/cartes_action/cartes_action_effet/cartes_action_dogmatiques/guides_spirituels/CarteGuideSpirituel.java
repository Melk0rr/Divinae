package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants.CarteCroyant;
import cartes.divinites.Divinite;
import dogme.Dogme;

/**
 * @author Lallement
 * La classe CarteGuideSpirituel decrit le comportement des cartes Guides Spirituels
 */

public class CarteGuideSpirituel extends CarteActionDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Nombre de croyants qu'un guide spirituel peut rassembler
	 */
	private int nbCroyantsTotal = 0;
	
	/**
	 * Tableau contenant les croyants rassembles autour du guide
	 */
	private CarteCroyant[] croyants;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument
	 * @param {String} intitule : intitule de la carte
	 */
	public CarteGuideSpirituel(String intitule) {
		super(intitule);
		this.croyants = new CarteCroyant[this.nbCroyantsTotal];
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine a attribuer a la carte
	 * @param {Dogme[]} dogmes : dogmes a attribuer  
	 * @param {int} totalCroyants : nombre de croyants total que le Guide peut rassembler
	 */
	public CarteGuideSpirituel(Origine origine, Dogme[] dogmes, int totalCroyants, String intitule) {
		super(origine, dogmes, intitule);
		this.nbCroyantsTotal = totalCroyants;
		this.croyants = new CarteCroyant[this.nbCroyantsTotal];
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut nbCroyantsTotal
	 * @return {int} nbCroyantsTotal : retourne le nombre de total croyants que le Guide peut rassembler
	 */
	public int getNbCroyantsTotal() {
		return this.nbCroyantsTotal;
	}

	/**
	 * Modificateur pour l'attribut nbCroyantsTotal
	 * @param {int} nbCroyantsTotal : nombre total de croyants a attribuer a la carte croyant
	 */
	public void setNbCroyantsTotal(int nbCroyantsTotal) {
		this.nbCroyantsTotal = nbCroyantsTotal;
	}

	/**
	 * Accesseur pour l'attribut croyants
	 * @return {CarteCroyant[]} croyants : retourne un tableau de carte croyants
	 */
	public CarteCroyant[] getCroyants() {
		return this.croyants;
	}

	/**
	 * Modificateur pour l'attribut nbCroyantsTotal
	 * @param {CarteCroyant[}} croyants : tableau de croyants a attribuer au Guide
	 */
	public void setCroyants(CarteCroyant[] croyants) {
		this.croyants = croyants;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Methode permettant de lier un croyant a un guide spirituel
	 * @param {CarteCroyant} croyant : croyant a lier au guide
	 */
	public void addCroyant(CarteCroyant croyant) {
		for (int i = 0; i < this.nbCroyantsTotal; i++) {
			if (this.croyants[i] == null) this.croyants[i] = croyant;
		}
	}
	
	/**
	 * Methode permettant d'ajouter les points de prieres de tous les croyants rassembles autour d'un guide
	 * a une divinite donnee
	 * @param {Divinite} d : divinite a laquelle on souhaite ajouter les points 
	 */
	public void guiderVersDivinite(Divinite d) {
		for (CarteCroyant carteCroyant : croyants) {
			carteCroyant.ajouterPrieres(d);
		}
	}
	
	/**
	 * M�thode retournant tous les guides spirituels
	 * @return {ArrayList<CarteGuideSpirituel>} divinites : retourne un ArrayList contenant tous les guides spirituels
	 */
	public static ArrayList<CarteGuideSpirituel> getAllGuides() {
		ArrayList<CarteGuideSpirituel> guides = new ArrayList<CarteGuideSpirituel>();
		guides.add(CarteAnarchiste.getInstance());
		guides.add(CarteAscete.getInstance());
		guides.addAll(CarteClerc.getAllClercs());
		guides.add(CarteDevin.getInstance());
		guides.add(CarteExorciste.getInstance());
		guides.addAll(CarteMartyr.getAllMartyrs());
		guides.add(CarteMessie.getInstance());
		guides.add(CartePaladin.getInstance());
		guides.add(CarteShaman.getInstance());
		guides.add(CarteSorcier.getInstance());
		guides.add(CarteTyran.getInstance());
		return guides;
	}
	
	/**
	 * Methode permettant de donner les d�tails d'un guide
	 * @return {String} : retourne un cha�ne de caract�re d�crivant le guide
	 */
	@Override
	public String toString() {
		return "Guide Spirituel: " + this.getIntituleCarte() + 
				" ,, Origine: " + this.getOrigineCarte() + 
				" ,, Nombre de croyants: " + this.getNbCroyantsTotal() + 
				" ,, Dogmes: " + this.getDogmes()[0] + ", " + this.getDogmes()[1];
	}
	
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CarteGuideSpirituel> testGuides = CarteGuideSpirituel.getAllGuides();
		System.out.println(testGuides.size());
		for (CarteGuideSpirituel guide : testGuides) {
			System.out.println(guide.toString());
		}
	}

}
