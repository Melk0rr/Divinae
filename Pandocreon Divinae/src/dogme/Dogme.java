/**
 * 
 */
package dogme;

/**
 * @author Lallement
 * La classe dogme d�crit les dogmes adopt�s par certaines cartes.
 */
public class Dogme {
	/* ---------- Attributs ---------- */
	/**
	 * Libell� du dogme. Parmis les possibilit�s de l'�num�ration LibelleDogme
	 */
	private LibelleDogme libD;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * 	Un dogme doit obligatoirement poss�der un libelle. On supprime donc le constructeur publique par d�faut
	 */
	private Dogme() {}
	
	/**
	 * Constructeur avec arguments
	 * Tout Dogme nouvellement cr�� doit poss�der un libell�
	 * @param {LibelleDogme} libD : libell� � attribuer au dogme
	 */
	public Dogme(LibelleDogme libD) {
		this.libD = libD;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir le libell� d'un dogme
	 * @return {LibelleDogme} libD : retourne le libell� du dogme
	 */
	public LibelleDogme getLibD() {
		return this.libD;
	}
	
	/**
	 * Modificateur permettant d'�diter le libell� d'un dogme
	 * @param {LibelleDogme} libD : libell� � attribuer au dogme
	 */
	public void setLibD(LibelleDogme libD) {
		this.libD = libD;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode de tests
	 * @param {String[]} args
	 */
	public static void main(String[] args) {
		
	}
}