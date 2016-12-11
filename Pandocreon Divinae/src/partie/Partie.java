/**
 * 
 */
package partie;

import java.util.ArrayList;

import cartes.cartes_action.CarteAction;
import cartes.divinites.Divinite;
import de.De;
import exceptions.NumberOfPlayersException;
import joueur.Joueur;

/**
 * @author Lallement
 * La classe Partie d�crit le comportement d'une partie. Il s'agit de la classe principale du programme
 * La classe sera charg�e de lancer un nouvelle partie sur demande.
 */
public class Partie implements Runnable {
	/* ---------- Attributs ---------- */
	/**
	 * Joueurs participant � la partie
	 */
	private ArrayList<Joueur> participants;
	
	/**
	 * Pioche de la partie.
	 */
	private ArrayList<CarteAction> pioche = CarteAction.getAllCartesAction();
	
	/**
	 * Cimetiere de la partie
	 */
	private ArrayList<CarteAction> cimetiere = null;
	
	/**
	 * Divinites que les joueurs peuvent incarner
	 */
	private ArrayList<Divinite> piocheDivinites = Divinite.getAllDivinites();
	
	/**
	 * Gagnant de la partie
	 */
	private Joueur gagnant = null;
	
	/**
	 * Tours de la partie
	 */
	private ArrayList<Tour> tours = null;
	
	/**
	 * De uitilise lors de la partie
	 */
	private De de = De.getInstance();
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument
	 * @param {int} nbJoueurs : nombre de participants souhaite
	 * @throws NumberOfPlayersException 
	 */
	public Partie(int nbJoueurs) throws NumberOfPlayersException {
		if (nbJoueurs > 6 || nbJoueurs < 2) {
			throw new NumberOfPlayersException();
		} else {
			this.participants = Joueur.getSixParticipants(nbJoueurs, this);
			for (Joueur joueur : this.participants) {
				joueur.distribuerJeu();
				System.out.println(joueur.toString() + "\n -----------------------");
			}
		}
	} 

	/* ---------- Getters & Setters ---------- */	
	/**
	 * Accesseur pour l'attribut participants
	 * @return {ArrayList<Joueur>} participants : retourne un ArrayList contenant les participants de la partie
	 */
	public ArrayList<Joueur> getParticipants() {
		return this.participants;
	}

	/**
	 * Modificateur pour l'attribut participants
	 * @param {ArrayList<Joueur>} participants : ArrayList contenant les participants a attribuer a la partie
	 */
	public void setParticipants(ArrayList<Joueur> participants) {
		this.participants = participants;
	}

	/**
	 * Accesseur pour l'attribut pioche
	 * @return {ArrayList<CarteAction>} pioche : retourne un ArrayList contenant les cartes actions de la pioche
	 */
	public ArrayList<CarteAction> getPioche() {
		return this.pioche;
	}

	/**
	 * Modificateur pour l'attribut pioche
	 * @param {ArrayList<CarteAction>} pioche : ArrayList contenant les cartes actions a attribuer a la pioche
	 */
	public void setPioche(ArrayList<CarteAction> pioche) {
		this.pioche = pioche;
	}

	/**
	 * Accesseur pour l'attribut cimetiere
	 * @return {ArrayList<CarteAction>} cimetiere : retourne un ArrayList contenant les cartes ayant ete defaussees
	 */
	public ArrayList<CarteAction> getCimetiere() {
		return this.cimetiere;
	}

	/**
	 * Modificateur pour l'attribut cimetiere
	 * @param {ArrayList<CarteAction>} cimetiere : ArrayList contenant les cartes a attribuer au cimetiere
	 */
	public void setCimetiere(ArrayList<CarteAction> cimetiere) {
		this.cimetiere = cimetiere;
	}

	/**
	 * Accesseur pour l'attribut piocheDivinites
	 * @return {ArrayList<Divinite>} piocheDivinite : retourne un ArrayList contenant les divinites disponibles
	 */
	public ArrayList<Divinite> getPiocheDivinites() {
		return this.piocheDivinites;
	}

	/**
	 * Modificateur pour l'attribut piocheDivinites
	 * @param {ArrayList<Divinite>} piocheDivinite : ArrayList contenant les divinites a attribuer a la pioche divinite
	 */
	public void setPiocheDivinites(ArrayList<Divinite> piocheDivinites) {
		this.piocheDivinites = piocheDivinites;
	}

	/**
	 * Accesseur pour l'attribut gagnant
	 * @return {Joueur} gagnant : retourne le gagnant de la partie s'il y en a un
	 */
	public Joueur getGagnant() {
		return this.gagnant;
	}

	/**
	 * Modificateur pour l'attribut gagnant
	 * @param {Joueur} gagnant : joueur ayant gagne la partie
	 */
	public void setGagnant(Joueur gagnant) {
		this.gagnant = gagnant;
	}

	/**
	 * Accesseur pour l'attribut tours
	 * @return {ArrayList<Tour>} tours : retourne un ArrayList contenant les tours d'une partie
	 */
	public ArrayList<Tour> getTours() {
		return this.tours;
	}

	/**
	 * Modificateur pour l'attribut tours
	 * @param {ArrayList<Tour>} tours : ArrayList contenant les tours a attribuer a une partie
	 */
	public void setTours(ArrayList<Tour> tours) {
		this.tours = tours;
	}
	
	/**
	 * Accesseur pour l'attribut de
	 * @return {De} de : retourne l'instance de De utilisee pour la partie
	 */
	public De getDe() {
		return this.de;
	}

	/* ---------- M�thodes ---------- */
	/**
	 * Impl�mentation de la m�thode run
	 * @see Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Partie p = new Partie(6);
		} catch (NumberOfPlayersException e) {
			e.printStackTrace();
		}
	}
}
