package cartes.cartes_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import cartes.Carte;
import cartes.cartes_dogmatiques.CarteDogmatique;
import cartes.divinites.Divinite;
import dogme.Dogme;
import effets.Effet;
import effets.EffetAjoutPointAction;
import effets.EffetBloquerGainPoint;
import effets.EffetContrainteSacrifice;
import effets.EffetCopierEffet;
import effets.EffetPiocherMain;
import effets.EffetRamenerCarte;
import effets.EffetRecupererPointAction;
import effets.EffetRelancerDe;
import effets.EffetRetirerCroyants;
/**
 * 
 * @author Lallement
 * La classe CarteCroyant decrit le comportement generale des cartes Croyants
 */
public class CarteCroyant extends CarteDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Points de priere de la carte croyant
	 */
	private int pointsPriere = 0;
	
	/**
	 * Numero du tour durant lequel la carte a ete creee
	 * *posee sur la table
	 */
	private int numTourCreation = 0;
	
	/**
	 * Possibilite de sacrifier la carte
	 * True si on peut sacrifier la carte
	 * False sinon, dans les cas ou la carte vient d'etre creee ou si elle est au centre de la table
	 */
	private boolean estSacrifiable = false;
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine a attribuer a la carte 
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 * @param {int} pointsPriere : points de priere que la carte doit posseder
	 * @param {String} intitule : intitule de la carte nouvellement creee
	 * @param {Effet} effet : effet a attribuer a la carte nouvellement creee  
	 */
	public CarteCroyant(Origine origine, Dogme[] dogmes, int pointsPriere, String intitule, Effet effet) {
		super(origine, dogmes, intitule, effet);
		this.pointsPriere = pointsPriere;
	}
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut pointsPriere
	 * @return {int} pointsPriere : retourne le nombre de points de priere dont dispose la carte
	 */
	public int getPointsPriere() {
		return this.pointsPriere;
	}

	/**
	 * Modificateur pour l'attribut pointsPriere
	 * @param {int} pointsPriere : points de priere � attribuer � la carte 
	 */
	public void setPointsPriere(int pointsPriere) {
		this.pointsPriere = pointsPriere;
	}

	/**
	 * Accesseur pour l'attribut numTourCreation
	 * @return {int} numTourCreation : retourne le num�ro du tour durant lequel la carte a �t� cr��e
	 */
	public int getNumTourCreation() {
		return this.numTourCreation;
	}

	/**
	 * Modificateur pour l'attribut numTourCreation
	 * @param {int} numTourCreation : num�ro du tour de cr�ation � attribuer
	 */
	public void setNumTourCreation(int numTourCreation) {
		this.numTourCreation = numTourCreation;
	}

	/**
	 * Accesseur pour l'attribut estSacrifiable
	 * @return {boolean} estSacrifiable : retourne true si la carte est sacrifiable, false sinon
	 */
	public boolean isEstSacrifiable() {
		return this.estSacrifiable;
	}

	/**
	 * Modificateur pour l'attribut estSacrifiable
	 */
	public void setEstSacrifiable() {
		this.estSacrifiable = (this.estSacrifiable) ? false : true;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Methode permettant d'ajouter les points de prieres de la carte � une divinite donn�e
	 * @param {Divinite} d : divinite a laquelle on souhaite ajouter les points
	 */
	public void ajouterPrieres(Divinite d) {
		d.setTotalPrieres(d.getTotalPrieres() + this.pointsPriere);
	}
	
	/**
	 * Methode retournant toutes les cartes croyant
	 * @return {ArrayList<Carte>} croyants : retourne un ArrayList contenant toutes les divinites
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> croyants = new ArrayList<Carte>();
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}, 2, "Moines", new EffetAjoutPointAction(Origine.JOUR)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Moines", new EffetAjoutPointAction(Origine.JOUR)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}, 2, "Moines", new EffetAjoutPointAction(Origine.JOUR)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 2, "Moines", new EffetAjoutPointAction(Origine.JOUR)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}, 2, "Moines", new EffetAjoutPointAction(Origine.JOUR)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Travailleurs", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.NATURE, Dogme.MYSTIQUES})));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}, 2, "Travailleurs", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.CHAOS, Dogme.MYSTIQUES})));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Travailleurs", new EffetPiocherMain(2)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}, 1, "Ermite", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 1, "Ermite", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS}, 1, "Integristes", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 4, "Guerriers Saints", new EffetRamenerCarte()));
		croyants.add(new CarteCroyant(Origine.JOUR, new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}, 4, "Diplomates", new EffetRelancerDe()));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}, 2, "Demons", new EffetAjoutPointAction(Origine.NUIT)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Demons", new EffetAjoutPointAction(Origine.NUIT)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}, 2, "Demons", new EffetAjoutPointAction(Origine.NUIT)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 2, "Demons", new EffetAjoutPointAction(Origine.NUIT)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}, 2, "Demons", new EffetAjoutPointAction(Origine.NUIT)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS}, 2, "Alchimistes", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.HUMAIN, Dogme.MYSTIQUES})));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}, 2, "Alchimistes", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.HUMAIN, Dogme.SYMBOLES})));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS}, 2, "Alchimistes", new EffetPiocherMain(2)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}, 1, "Vampire", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 1, "Vampire", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS}, 4, "Lycanthropes", new EffetRetirerCroyants()));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 4, "Pillards", new EffetRecupererPointAction()));
		croyants.add(new CarteCroyant(Origine.NUIT, new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}, 4, "Illusionnistes", new EffetCopierEffet()));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}, 2, "Esprits", new EffetAjoutPointAction(Origine.NEANT)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Esprits", new EffetAjoutPointAction(Origine.NEANT)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}, 2, "Esprits", new EffetAjoutPointAction(Origine.NEANT)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}, 2, "Esprits", new EffetAjoutPointAction(Origine.NEANT)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}, 2, "Esprits", new EffetAjoutPointAction(Origine.NEANT)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Alienes", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.NATURE, Dogme.MYSTIQUES})));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}, 2, "Alienes", new EffetContrainteSacrifice(false, new Dogme[] {Dogme.MYSTIQUES, Dogme.CHAOS})));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Alienes", new EffetPiocherMain(2)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}, 1, "Revenant", new EffetRelancerDe()));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Revolutionnaires", new EffetContrainteSacrifice(true, null)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}, 2, "Alienes", new EffetPiocherMain(2)));
		croyants.add(new CarteCroyant(Origine.NEANT, new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}, 4, "Nihilistes", new EffetBloquerGainPoint()));
		// TODO ameliorer les effets
		return croyants;
	}
	
	/**
	 * Methode permettant de donner les d�tails d'un croyant
	 * @return {String} : retourne un cha�ne de caract�re d�crivant le croyant
	 */
	@Override
	public String toString() {
		return "Croyant: " + this.getIntituleCarte() + 
				" ,, Origine: " + this.getOrigineCarte() + 
				" ,, Points de priere: " + this.getPointsPriere() + 
				" ,, Dogmes: " + this.getDogmes()[0] + ", " + this.getDogmes()[1] + ", " + this.getDogmes()[2];
	}
	
	/**
	 * Surcharge de la methode jouerCarte.
	 * La methode place la carte croyant au centre de la table.
	 */
	public void placerAuCentre() {
		System.out.println("Le croyant " + this.getIntituleCarte() + " est jou� par " + this.getJoueur().getNom());
		this.getJoueur().getPartie().getCentreTable().add(this);
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Carte> testCroyants = CarteCroyant.getAll();
		System.out.println(testCroyants.size());
		for (Carte croyant : testCroyants) {
			System.out.println(croyant.toString());
		}
	}

}
